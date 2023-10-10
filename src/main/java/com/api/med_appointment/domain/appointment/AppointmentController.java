package com.api.med_appointment.domain.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springdoc.core.converters.models.PageableAsQueryParam;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @Operation(summary = "Create an Appointment", description = "Create a new appointment.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Appointment created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AppointmentDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request"),
            @ApiResponse(responseCode = "404", description = "Appointment not found")
    })
    @PostMapping
    public ResponseEntity<AppointmentDTO> createAppointment(@RequestBody AppointmentDTO appointmentDTO) {
        AppointmentDTO createdAppointment = appointmentService.createAppointment(appointmentDTO);
        return new ResponseEntity<>(createdAppointment, HttpStatus.CREATED);
    }

    @Operation(summary = "Update an Appointment", description = "Update an existing appointment by ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Appointment updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AppointmentDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request"),
            @ApiResponse(responseCode = "404", description = "Appointment not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<AppointmentDTO> updateAppointment(@PathVariable Long id, @RequestBody AppointmentDTO appointmentDTO) {
        AppointmentDTO updatedAppointment = appointmentService.updateAppointment(id, appointmentDTO);
        return ResponseEntity.ok(updatedAppointment);
    }

    @Operation(summary = "Get an Appointment by ID", description = "Retrieve an appointment by its unique ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Appointment found successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AppointmentDTO.class))),
            @ApiResponse(responseCode = "404", description = "Appointment not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<AppointmentDTO> getAppointmentById(@PathVariable Long id) {
        AppointmentDTO appointmentDTO = appointmentService.getAppointmentById(id);
        return ResponseEntity.ok(appointmentDTO);
    }

    @Operation(summary = "Get All Appointments", description = "Retrieve a list of all appointments.")
    @ApiResponse(responseCode = "200", description = "List of appointments retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AppointmentDTO.class)))
    @GetMapping
    public ResponseEntity<List<AppointmentDTO>> getAllAppointments() {
        List<AppointmentDTO> appointments = appointmentService.getAllAppointments();
        return ResponseEntity.ok(appointments);
    }

    @Operation(summary = "Delete an Appointment by ID", description = "Delete an appointment by its unique ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Appointment deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Appointment not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable Long id) {
        appointmentService.deleteAppointment(id);
        return ResponseEntity.noContent().build();
    }
}
