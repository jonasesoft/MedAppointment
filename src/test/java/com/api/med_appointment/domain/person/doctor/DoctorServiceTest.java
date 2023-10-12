package com.api.med_appointment.domain.person.doctor;

import com.api.med_appointment.ApplicationConfigTest;
import com.api.med_appointment.exceptions.DoctorNotFoundException;
import org.junit.jupiter.api.DisplayName;

import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.dao.DataIntegrityViolationException;



@DisplayName("DoctorServiceTest")
public class DoctorServiceTest extends ApplicationConfigTest {
    
    @MockBean
    DoctorRepository doctorRepository;

    @MockBean
    ModelMapper mapper;

    @Autowired
    private DoctorService doctorService;


    // createDoctor method saves a new DoctorDTO object to the repository and returns the saved object
    @Test
    public void test_createDoctor_savesNewDoctorAndReturnsSavedObject() {
        // Arrange
        DoctorDTO doctorDTO = new DoctorDTO(1L, "John Doe", new Date(), "12345678901", "1234567890", "johndoe@example.com", "1234567", DoctorSpecialty.GENERAL_PRACTITIONER);
        Doctor savedDoctor = new Doctor(1L, "1234567", DoctorSpecialty.GENERAL_PRACTITIONER);
        when(doctorRepository.save(any(Doctor.class))).thenReturn(savedDoctor);

        // Act
        DoctorDTO result = doctorService.createDoctor(doctorDTO);

        // Assert
        assertEquals(savedDoctor.getId(), result.getId());
        assertEquals(savedDoctor.getName(), result.getName());
        assertEquals(savedDoctor.getDateBirth(), result.getDateBirth());
        assertEquals(savedDoctor.getCpf(), result.getCpf());
        assertEquals(savedDoctor.getPhonenumber(), result.getPhonenumber());
        assertEquals(savedDoctor.getEmail(), result.getEmail());
        assertEquals(savedDoctor.getCrm(), result.getCrm());
        assertEquals(savedDoctor.getDoctorSpecialty(), result.getDoctorSpecialty());
    }

    // updateDoctor method updates an existing DoctorDTO object in the repository and returns the updated object
    @Test
    public void test_updateDoctor_updatesExistingDoctorAndReturnsUpdatedObject() {
        // Arrange
        Long id = 1L;
        DoctorDTO doctorDTO = new DoctorDTO(1L, "John Doe", new Date(), "12345678901", "1234567890", "johndoe@example.com", "1234567", DoctorSpecialty.GENERAL_PRACTITIONER);
        Doctor existingDoctor = new Doctor(1L, "1234567", DoctorSpecialty.GENERAL_PRACTITIONER);
        Doctor updatedDoctor = new Doctor(1L, "7654321", DoctorSpecialty.DERMATOLOGIST);
        when(doctorRepository.findById(id)).thenReturn(Optional.of(existingDoctor));
        when(doctorRepository.save(any(Doctor.class))).thenReturn(updatedDoctor);

        // Act
        DoctorDTO result = doctorService.updateDoctor(id, doctorDTO);

        // Assert
        assertEquals(updatedDoctor.getId(), result.getId());
        assertEquals(updatedDoctor.getName(), result.getName());
        assertEquals(updatedDoctor.getDateBirth(), result.getDateBirth());
        assertEquals(updatedDoctor.getCpf(), result.getCpf());
        assertEquals(updatedDoctor.getPhonenumber(), result.getPhonenumber());
        assertEquals(updatedDoctor.getEmail(), result.getEmail());
        assertEquals(updatedDoctor.getCrm(), result.getCrm());
        assertEquals(updatedDoctor.getDoctorSpecialty(), result.getDoctorSpecialty());
    }

    // getDoctorById method returns the correct DoctorDTO object for a given ID
    @Test
    public void test_getDoctorById_returnsCorrectDoctorForGivenId() {
        // Arrange
        Long id = 1L;
        Doctor existingDoctor = new Doctor(1L, "1234567", DoctorSpecialty.GENERAL_PRACTITIONER);
        when(doctorRepository.findById(id)).thenReturn(Optional.of(existingDoctor));

        // Act
        DoctorDTO result = doctorService.getDoctorById(id);

        // Assert
        assertEquals(existingDoctor.getId(), result.getId());
        assertEquals(existingDoctor.getName(), result.getName());
        assertEquals(existingDoctor.getDateBirth(), result.getDateBirth());
        assertEquals(existingDoctor.getCpf(), result.getCpf());
        assertEquals(existingDoctor.getPhonenumber(), result.getPhonenumber());
        assertEquals(existingDoctor.getEmail(), result.getEmail());
        assertEquals(existingDoctor.getCrm(), result.getCrm());
        assertEquals(existingDoctor.getDoctorSpecialty(), result.getDoctorSpecialty());
    }

    // createDoctor method throws an exception if the DoctorDTO object already exists in the repository
    @Test
    public void test_createDoctor_throwsExceptionIfDoctorAlreadyExists() {
        // Arrange
        DoctorDTO doctorDTO = new DoctorDTO(1L, "John Doe", new Date(), "12345678901", "1234567890", "johndoe@example.com", "1234567", DoctorSpecialty.GENERAL_PRACTITIONER);
        when(doctorRepository.save(any(Doctor.class))).thenThrow(new DataIntegrityViolationException("Duplicate entry"));

        // Act & Assert
        assertThrows(DataIntegrityViolationException.class, () -> doctorService.createDoctor(doctorDTO));
    }

    // updateDoctor method throws an exception if the DoctorDTO object does not exist in the repository
    @Test
    public void test_updateDoctor_throwsExceptionIfDoctorDoesNotExist() {
        // Arrange
        Long id = 1L;
        DoctorDTO doctorDTO = new DoctorDTO(1L, "John Doe", new Date(), "12345678901", "1234567890", "johndoe@example.com", "1234567", DoctorSpecialty.GENERAL_PRACTITIONER);
        when(doctorRepository.findById(id)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(DoctorNotFoundException.class, () -> doctorService.updateDoctor(id, doctorDTO));
    }

    // getDoctorById method throws an exception if the ID is not found in the repository
    @Test
    public void test_getDoctorById_throwsExceptionIfIdNotFound() {
        // Arrange
        Long id = 1L;
        when(doctorRepository.findById(id)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(DoctorNotFoundException.class, () -> doctorService.getDoctorById(id));
    }

}
