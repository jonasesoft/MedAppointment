package com.api.med_appointment.domain.person.patient;

import com.api.med_appointment.domain.person.doctor.DoctorDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PatientDTO {
    private Long id;
    private String name;
    private Date dateBirth;
    private String cpf;
    private String phonenumber;
    private String email;
    private String medicalHistory;
    private String obs;
    private PatientInsurance patientInsurance;

    public PatientDTO(){

    }

    public PatientDTO(Long id, String name, Date dateBirth, String cpf, String phonenumber, String email, String medicalHistory, String obs, PatientInsurance patientInsurance) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
        this.cpf = cpf;
        this.phonenumber = phonenumber;
        this.email = email;
        this.medicalHistory = medicalHistory;
        this.obs = obs;
        this.patientInsurance = patientInsurance;
    }

    public PatientDTO(Patient patient) {
        id = patient.getId();
        name = patient.getName();
        dateBirth = patient.getDateBirth();
        cpf = patient.getCpf();
        phonenumber = patient.getPhonenumber();
        email = patient.getEmail();
        medicalHistory = patient.getMedicalHistory();
        obs = patient.getObs();
        patientInsurance = patient.getPatientInsurance();
    }
}
