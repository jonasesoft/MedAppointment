package com.api.med_appointment.domain.person.patient;


import com.api.med_appointment.exceptions.PatientNotFoundException;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@DisplayName("PatientServiceTest")
public class PatientServiceTest {

    @MockBean
    PatientRepository patientRepository;

    @MockBean
    ModelMapper mapper;

    @Autowired
    private PatientService patientService;

    @Test
    public void stillworks(){
        System.out.println("working");
    }

        // createPatient method creates a new patient with valid input
        @Test
        public void test_create_patient_with_valid_input() {
            // Arrange
            PatientDTO patientDTO = new PatientDTO(1L, "John Doe", new Date(), "12345678901", "1234567890", "johndoe@example.com", "No medical history", "No observation", PatientInsurance.PUBLIC);

            PatientRepository patientRepository = mock(PatientRepository.class);
            when(patientRepository.save(any(Patient.class))).thenReturn(new Patient(1L, "No medical history", "No observation", PatientInsurance.PUBLIC));

            PatientService patientService = new PatientService(patientRepository);

            // Act
            PatientDTO result = patientService.createPatient(patientDTO);

            // Assert
            assertNotNull(result);
            assertEquals(1L, result.getId().longValue());
            assertEquals("John Doe", result.getName());
            assertEquals("12345678901", result.getCpf());
            assertEquals("1234567890", result.getPhonenumber());
            assertEquals("johndoe@example.com", result.getEmail());
            assertEquals("No medical history", result.getMedicalHistory());
            assertEquals("No observation", result.getObs());
            assertEquals(PatientInsurance.PUBLIC, result.getPatientInsurance());
        }

        // updatePatient method updates an existing patient with valid input
        @Test
        public void test_update_existing_patient_with_valid_input() {
            // Arrange
            Long id = 1L;
            PatientDTO patientDTO = new PatientDTO(1L, "John Doe", new Date(), "12345678901", "1234567890", "johndoe@example.com", "No medical history", "No observation", PatientInsurance.PUBLIC);

            Optional<Patient> optionalPatient = Optional.of(new Patient(1L, "Old medical history", "Old observation", PatientInsurance.PRIVATE));

            PatientRepository patientRepository = mock(PatientRepository.class);
            when(patientRepository.findById(id)).thenReturn(optionalPatient);
            when(patientRepository.save(any(Patient.class))).thenReturn(new Patient(1L, "No medical history", "No observation", PatientInsurance.PUBLIC));

            PatientService patientService = new PatientService(patientRepository);

            // Act
            PatientDTO result = patientService.updatePatient(id, patientDTO);

            // Assert
            assertNotNull(result);
            assertEquals(1L, result.getId().longValue());
            assertEquals("John Doe", result.getName());
            assertEquals("12345678901", result.getCpf());
            assertEquals("1234567890", result.getPhonenumber());
            assertEquals("johndoe@example.com", result.getEmail());
            assertEquals("No medical history", result.getMedicalHistory());
            assertEquals("No observation", result.getObs());
            assertEquals(PatientInsurance.PUBLIC, result.getPatientInsurance());
        }

        // getPatientById method returns an existing patient with valid input
        @Test
        public void test_get_existing_patient_by_id() {
            // Arrange
            Long id = 1L;
            Optional<Patient> optionalPatient = Optional.of(new Patient(1L, "No medical history", "No observation", PatientInsurance.PUBLIC));

            PatientRepository patientRepository = mock(PatientRepository.class);
            when(patientRepository.findById(id)).thenReturn(optionalPatient);

            PatientService patientService = new PatientService(patientRepository);

            // Act
            PatientDTO result = patientService.getPatientById(id);

            // Assert
            assertNotNull(result);
            assertEquals(1L, result.getId().longValue());
            assertEquals("No medical history", result.getMedicalHistory());
            assertEquals("No observation", result.getObs());
            assertEquals(PatientInsurance.PUBLIC, result.getPatientInsurance());
        }

        // createPatient method throws an exception when input is null or empty
        @Test
        public void test_create_patient_with_null_or_empty_input() {
            // Arrange
            PatientDTO patientDTO = null;

            PatientRepository patientRepository = mock(PatientRepository.class);

            PatientService patientService = new PatientService(patientRepository);

            // Act & Assert
            assertThrows(IllegalArgumentException.class, () -> {
                patientService.createPatient(patientDTO);
            });
        }

        // createPatient method throws an exception when input has invalid fields
        @Test
        public void test_create_patient_with_invalid_fields() {
            // Arrange
            PatientDTO patientDTO = new PatientDTO(1L, "John Doe", new Date(), "12345678901234567890", "1234567890", "johndoe@example.com", "No medical history", "No observation", PatientInsurance.PUBLIC);

            PatientRepository patientRepository = mock(PatientRepository.class);

            PatientService patientService = new PatientService(patientRepository);

            // Act & Assert
            assertThrows(ConstraintViolationException.class, () -> {
                patientService.createPatient(patientDTO);
            });
        }

        // updatePatient method throws an exception when patient with given id does not exist
        @Test
        public void test_update_non_existing_patient() {
            // Arrange
            Long id = 1L;
            PatientDTO patientDTO = new PatientDTO(1L, "John Doe", new Date(), "12345678901", "1234567890", "johndoe@example.com", "No medical history", "No observation", PatientInsurance.PUBLIC);

            Optional<Patient> optionalPatient = Optional.empty();

            PatientRepository patientRepository = mock(PatientRepository.class);
            when(patientRepository.findById(id)).thenReturn(optionalPatient);

            PatientService patientService = new PatientService(patientRepository);

            // Act & Assert
            assertThrows(PatientNotFoundException.class, () -> {
                patientService.updatePatient(id, patientDTO);
            });
        }

    }


