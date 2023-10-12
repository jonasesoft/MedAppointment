package com.api.med_appointment.domain.person.patient;


import com.api.med_appointment.ApplicationConfigTest;
import com.api.med_appointment.exceptions.PatientNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DisplayName("PatientControllerTest")
public class PatientControllerTest extends ApplicationConfigTest {

    @MockBean
    PatientService patientService;

    @Autowired
    PatientController patientController;

    @Test
    public void test_create_patient_successfully() {
        // Arrange
        PatientDTO patientDTO = new PatientDTO(1L, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "No medical history", "No observations", PatientInsurance.PUBLIC);

        // Act
        ResponseEntity<PatientDTO> response = patientController.createPatient(patientDTO);

        // Assert
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(patientDTO.getId(), response.getBody().getId());
        assertEquals(patientDTO.getName(), response.getBody().getName());
        assertEquals(patientDTO.getDateBirth(), response.getBody().getDateBirth());
        assertEquals(patientDTO.getCpf(), response.getBody().getCpf());
        assertEquals(patientDTO.getPhonenumber(), response.getBody().getPhonenumber());
        assertEquals(patientDTO.getEmail(), response.getBody().getEmail());
        assertEquals(patientDTO.getMedicalHistory(), response.getBody().getMedicalHistory());
        assertEquals(patientDTO.getObs(), response.getBody().getObs());
        assertEquals(patientDTO.getPatientInsurance(), response.getBody().getPatientInsurance());
    }

    @Test
    public void test_update_patient_successfully() {
        // Arrange
        Long id = 1L;
        PatientDTO patientDTO = new PatientDTO(id, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "No medical history", "No observations", PatientInsurance.PUBLIC);

        // Act
        ResponseEntity<PatientDTO> response = patientController.updatePatient(id, patientDTO);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(patientDTO.getId(), response.getBody().getId());
        assertEquals(patientDTO.getName(), response.getBody().getName());
        assertEquals(patientDTO.getDateBirth(), response.getBody().getDateBirth());
        assertEquals(patientDTO.getCpf(), response.getBody().getCpf());
        assertEquals(patientDTO.getPhonenumber(), response.getBody().getPhonenumber());
        assertEquals(patientDTO.getEmail(), response.getBody().getEmail());
        assertEquals(patientDTO.getMedicalHistory(), response.getBody().getMedicalHistory());
        assertEquals(patientDTO.getObs(), response.getBody().getObs());
        assertEquals(patientDTO.getPatientInsurance(), response.getBody().getPatientInsurance());
    }

    @Test
    public void test_retrieve_patient_by_id_successfully() {
        // Arrange
        Long id = 1L;
        PatientDTO patientDTO = new PatientDTO(id, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "No medical history", "No observations", PatientInsurance.SUS);
        when(patientService.getPatientById(id)).thenReturn(patientDTO);

        // Act
        ResponseEntity<PatientDTO> response = patientController.getPatientById(id);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(patientDTO.getId(), response.getBody().getId());
        assertEquals(patientDTO.getName(), response.getBody().getName());
        assertEquals(patientDTO.getDateBirth(), response.getBody().getDateBirth());
        assertEquals(patientDTO.getCpf(), response.getBody().getCpf());
        assertEquals(patientDTO.getPhonenumber(), response.getBody().getPhonenumber());
        assertEquals(patientDTO.getEmail(), response.getBody().getEmail());
        assertEquals(patientDTO.getMedicalHistory(), response.getBody().getMedicalHistory());
        assertEquals(patientDTO.getObs(), response.getBody().getObs());
        assertEquals(patientDTO.getPatientInsurance(), response.getBody().getPatientInsurance());
    }

    @Test
    public void test_update_patient_invalid_id() {
        // Arrange
        Long id = 1L;
        PatientDTO patientDTO = new PatientDTO(id, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "No medical history", "No observations",PatientInsurance.SUS);
        when(patientService.updatePatient(id, patientDTO)).thenThrow(new PatientNotFoundException("Patient not found with ID: " + id));

        // Act
        ResponseEntity<PatientDTO> response = patientController.updatePatient(id, patientDTO);

        // Assert
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertNull(response.getBody());
    }






}
