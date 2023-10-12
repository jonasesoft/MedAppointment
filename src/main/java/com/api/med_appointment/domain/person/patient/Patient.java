package com.api.med_appointment.domain.person.patient;

import com.api.med_appointment.domain.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "patient")
@Entity
public class Patient extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "medical_history", length = 255)
    @Size(max = 255, message = "Medical history must have a maximum of 255 characters")
    private String medicalHistory;

    @Column(name = "observation", length = 255)
    @Size(max = 255, message = "Observation must have a maximum of 255 characters")
    private String obs;

    @Column(name = "patient_insurance", nullable = false)
    @Enumerated(EnumType.STRING)
    private PatientInsurance patientInsurance;

    public Patient(@Size(max = 255, message = "Name must have a maximum of 255 characters") String name, Date dateBirth, @Size(max = 11, message = "CPF must have a maximum of 11 characters") String cpf, String phonenumber, @Size(max = 255, message = "Email must have a maximum of 255 characters") String email, Long id, String medicalHistory, String obs, PatientInsurance patientInsurance) {
        super(name, dateBirth, cpf, phonenumber, email);
        this.id = id;
        this.medicalHistory = medicalHistory;
        this.obs = obs;
        this.patientInsurance = patientInsurance;
    }

    public Patient(Long id, String medicalHistory, String obs, PatientInsurance patientInsurance) {
        this.id = id;
        this.medicalHistory = medicalHistory;
        this.obs = obs;
        this.patientInsurance = patientInsurance;
    }
}

