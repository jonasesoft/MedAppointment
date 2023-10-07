package com.api.med_appointment.domain.person.doctor;

import com.api.med_appointment.domain.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctor")
@Entity
public class Doctor extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "crm", nullable = false)
    @Size(max = 7, message = "CRM must contain 7 numeric digits")
    private String crm;

    @Column(name = "doctor_specialty", nullable = false)
    @Enumerated(EnumType.STRING)
    private DoctorSpecialty doctorSpecialty;
}
