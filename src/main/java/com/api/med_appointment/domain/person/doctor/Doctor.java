package com.api.med_appointment.domain.person.doctor;

import com.api.med_appointment.domain.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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

    @NotBlank(message = "CRM cannot be blank")
    @Pattern(regexp = "\\d{7}", message = "CRM must contain 7 numeric digits")
    private String crm;

    @NotNull(message = "Doctor's specialty cannot be blank")
    @Enumerated(EnumType.STRING)
    private DoctorSpecialty doctorSpecialty;
}
