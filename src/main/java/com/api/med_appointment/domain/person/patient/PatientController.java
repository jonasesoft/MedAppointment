package com.api.med_appointment.domain.person.patient;

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
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @Operation(summary = "Create a Patient", description = "Create a new patient.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Patient created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PatientDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request"),
            @ApiResponse(responseCode = "404", description = "Patient not found")
    })
    @PostMapping
    public ResponseEntity<PatientDTO> createPatient(@RequestBody PatientDTO patientDTO) {
        PatientDTO createdPatient = patientService.createPatient(patientDTO);
        return new ResponseEntity<>(createdPatient, HttpStatus.CREATED);
    }

    @Operation(summary = "Update a Patient", description = "Update an existing patient by ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Patient updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PatientDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request"),
            @ApiResponse(responseCode = "404", description = "Patient not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<PatientDTO> updatePatient(@PathVariable Long id, @RequestBody PatientDTO patientDTO) {
        PatientDTO updatedPatient = patientService.updatePatient(id, patientDTO);
        return ResponseEntity.ok(updatedPatient);
    }

    @Operation(summary = "Get a Patient by ID", description = "Retrieve a patient by their unique ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Patient found successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PatientDTO.class))),
            @ApiResponse(responseCode = "404", description = "Patient not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<PatientDTO> getPatientById(@PathVariable Long id) {
        PatientDTO patientDTO = patientService.getPatientById(id);
        return ResponseEntity.ok(patientDTO);
    }

    @Operation(summary = "Get All Patients", description = "Retrieve a list of all patients.")
    @ApiResponse(responseCode = "200", description = "List of patients retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PatientDTO.class)))
    @GetMapping
    public ResponseEntity<List<PatientDTO>> getAllPatients() {
        List<PatientDTO> patients = patientService.getAllPatients();
        return ResponseEntity.ok(patients);
    }

    @Operation(summary = "Delete a Patient by ID", description = "Delete a patient by their unique ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Patient deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Patient not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return ResponseEntity.noContent().build();
    }
}
