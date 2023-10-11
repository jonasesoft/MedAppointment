package com.api.med_appointment.domain.person.patient;

import com.api.med_appointment.domain.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
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
}
