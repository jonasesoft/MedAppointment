package com.api.med_appointment.domain.person.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @Operation(summary = "Create a Doctor", description = "Create a new doctor.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Doctor created successfully", content = @Content(mediaType = "Documetation (isomnia and UML)/Application.propreties Files/application/json", schema = @Schema(implementation = DoctorDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request"),
            @ApiResponse(responseCode = "404", description = "Doctor not found")
    })
    @PostMapping
    public ResponseEntity<DoctorDTO> createDoctor(@RequestBody DoctorDTO doctorDTO) {
        DoctorDTO createdDoctor = doctorService.createDoctor(doctorDTO);
        return new ResponseEntity<>(createdDoctor, HttpStatus.CREATED);
    }

    @Operation(summary = "Update a Doctor", description = "Update an existing doctor by ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Doctor updated successfully", content = @Content(mediaType = "Documetation (isomnia and UML)/Application.propreties Files/application/json", schema = @Schema(implementation = DoctorDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request"),
            @ApiResponse(responseCode = "404", description = "Doctor not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<DoctorDTO> updateDoctor(@PathVariable Long id, @RequestBody DoctorDTO doctorDTO) {
        DoctorDTO updatedDoctor = doctorService.updateDoctor(id, doctorDTO);
        return ResponseEntity.ok(updatedDoctor);
    }

    @Operation(summary = "Get a Doctor by ID", description = "Retrieve a doctor by their unique ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Doctor found successfully", content = @Content(mediaType = "Documetation (isomnia and UML)/Application.propreties Files/application/json", schema = @Schema(implementation = DoctorDTO.class))),
            @ApiResponse(responseCode = "404", description = "Doctor not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<DoctorDTO> getDoctorById(@PathVariable Long id) {
        DoctorDTO doctorDTO = doctorService.getDoctorById(id);
        return ResponseEntity.ok(doctorDTO);
    }

    @Operation(summary = "Get All Doctors", description = "Retrieve a list of all doctors.")
    @ApiResponse(responseCode = "200", description = "List of doctors retrieved successfully", content = @Content(mediaType = "Documetation (isomnia and UML)/Application.propreties Files/application/json", schema = @Schema(implementation = DoctorDTO.class)))
    @GetMapping
    public ResponseEntity<List<DoctorDTO>> getAllDoctors() {
        List<DoctorDTO> doctors = doctorService.getAllDoctors();
        return ResponseEntity.ok(doctors);
    }

    @Operation(summary = "Delete a Doctor by ID", description = "Delete a doctor by their unique ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Doctor deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Doctor not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
        return ResponseEntity.noContent().build();
    }
}
