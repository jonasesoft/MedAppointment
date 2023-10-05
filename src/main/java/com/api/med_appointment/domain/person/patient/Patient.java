package com.api.med_appointment.domain.person.patient;

import com.api.med_appointment.domain.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank(message = "Medical history cannot be blank")
    @Size(max = 255, message = "Medical history must have a maximum of 255 characters")
    private String medicalHistory;

    @NotBlank(message = "Observation cannot be blank")
    @Size(max = 255, message = "Observation must have a maximum of 255 characters")
    private String obs;

    @NotNull(message = "Patient's insurance plan cannot be null")
    @Enumerated(EnumType.STRING)
    private PatientInsurance patientInsurance;
}
