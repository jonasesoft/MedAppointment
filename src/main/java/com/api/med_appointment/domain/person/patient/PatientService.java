package com.api.med_appointment.domain.person.patient;

import com.api.med_appointment.exceptions.PatientNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = new Patient();
        patient.setName(patientDTO.getName());
        patient.setDateBirth(patientDTO.getDateBirth());
        patient.setCpf(patientDTO.getCpf());
        patient.setPhonenumber(patientDTO.getPhonenumber());
        patient.setEmail(patientDTO.getEmail());
        patient.setMedicalHistory(patientDTO.getMedicalHistory());
        patient.setObs(patientDTO.getObs());
        patient.setPatientInsurance(patientDTO.getPatientInsurance());

        Patient savedPatient = patientRepository.save(patient);
        return new PatientDTO(savedPatient);
    }

    public PatientDTO updatePatient(Long id, PatientDTO patientDTO) {
        Optional<Patient> optionalPatient = patientRepository.findById(id);

        if (optionalPatient.isPresent()) {
            Patient patient = optionalPatient.get();
            patient.setName(patientDTO.getName());
            patient.setDateBirth(patientDTO.getDateBirth());
            patient.setCpf(patientDTO.getCpf());
            patient.setPhonenumber(patientDTO.getPhonenumber());
            patient.setEmail(patientDTO.getEmail());
            patient.setMedicalHistory(patientDTO.getMedicalHistory());
            patient.setObs(patientDTO.getObs());
            patient.setPatientInsurance(patientDTO.getPatientInsurance());

            Patient updatedPatient = patientRepository.save(patient);
            return new PatientDTO(updatedPatient);
        } else {
            throw new PatientNotFoundException("Patient not found with ID: " + id);
        }
    }

    public PatientDTO getPatientById(Long id) {
        Optional<Patient> optionalPatient = patientRepository.findById(id);

        if (optionalPatient.isPresent()) {
            Patient patient = optionalPatient.get();
            return new PatientDTO(patient);
        } else {
            throw new PatientNotFoundException("Patient not found with ID: " + id);
        }
    }

    public List<PatientDTO> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        return patients.stream()
                .map(PatientDTO::new)
                .collect(Collectors.toList());
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
