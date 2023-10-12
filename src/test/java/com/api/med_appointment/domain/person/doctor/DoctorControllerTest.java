package com.api.med_appointment.domain.person.doctor;

import com.api.med_appointment.ApplicationConfigTest;
import com.api.med_appointment.exceptions.DoctorNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DisplayName("DoctorControllerTest")
public class DoctorControllerTest extends ApplicationConfigTest {

    @MockBean
    DoctorService doctorService;

    @Autowired
    DoctorController doctorController;

    @Test
    public void test_create_doctor_successfully() {
        // Arrange
        DoctorDTO doctorDTO = new DoctorDTO(1L, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "CRM123", DoctorSpecialty.GENERAL_PRACTITIONER);
        DoctorDTO expectedDoctor = new DoctorDTO(1L, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "CRM123", DoctorSpecialty.GENERAL_PRACTITIONER);
        when(doctorService.createDoctor(doctorDTO)).thenReturn(expectedDoctor);

        // Act
        ResponseEntity<DoctorDTO> response = doctorController.createDoctor(doctorDTO);

        // Assert
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(expectedDoctor, response.getBody());
    }

    @Test
    public void test_create_doctor_with_valid_data() {
        // Arrange
        DoctorDTO doctorDTO = new DoctorDTO(1L, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "CRM123", DoctorSpecialty.GENERAL_PRACTITIONER);
        DoctorDTO expectedDoctor = new DoctorDTO(1L, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "CRM123", DoctorSpecialty.GENERAL_PRACTITIONER);
        when(doctorService.createDoctor(doctorDTO)).thenReturn(expectedDoctor);

        // Act
        ResponseEntity<DoctorDTO> response = doctorController.createDoctor(doctorDTO);

        // Assert
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(expectedDoctor, response.getBody());
    }

    @Test
    public void test_update_existing_doctor_with_valid_data() {
        // Arrange
        Long id = 1L;
        DoctorDTO doctorDTO = new DoctorDTO(1L, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "CRM123", DoctorSpecialty.GENERAL_PRACTITIONER);
        DoctorDTO expectedDoctor = new DoctorDTO(1L, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "CRM123", DoctorSpecialty.GENERAL_PRACTITIONER);
        when(doctorService.updateDoctor(id, doctorDTO)).thenReturn(expectedDoctor);

        // Act
        ResponseEntity<DoctorDTO> response = doctorController.updateDoctor(id, doctorDTO);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedDoctor, response.getBody());
    }

    @Test
    public void test_retrieve_existing_doctor_by_id() {
        // Arrange
        Long id = 1L;
        DoctorDTO expectedDoctor = new DoctorDTO(1L, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "CRM123", DoctorSpecialty.GENERAL_PRACTITIONER);
        when(doctorService.getDoctorById(id)).thenReturn(expectedDoctor);

        // Act
        ResponseEntity<DoctorDTO> response = doctorController.getDoctorById(id);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedDoctor, response.getBody());
    }


    @Test
    public void test_update_non_existing_doctor() {
        // Arrange
        Long id = 1L;
        DoctorDTO doctorDTO = new DoctorDTO(1L, "John Doe", new Date(), "123456789", "1234567890", "johndoe@example.com", "CRM123", DoctorSpecialty.GENERAL_PRACTITIONER);
        when(doctorService.updateDoctor(id, doctorDTO)).thenThrow(new DoctorNotFoundException("Doctor not found with ID: " + id));

        // Act
        ResponseEntity<DoctorDTO> response = doctorController.updateDoctor(id, doctorDTO);

        // Assert
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertNull(response.getBody());
    }

    @Test
    public void test_retrieve_non_existing_doctor_by_id() {
        // Arrange
        Long id = 1L;
        when(doctorService.getDoctorById(id)).thenThrow(new DoctorNotFoundException("Doctor not found with ID: " + id));

        // Act
        ResponseEntity<DoctorDTO> response = doctorController.getDoctorById(id);

        // Assert
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertNull(response.getBody());
    }
}
