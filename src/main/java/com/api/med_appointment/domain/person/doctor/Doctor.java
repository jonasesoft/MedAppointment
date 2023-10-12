package com.api.med_appointment.domain.person.doctor;

import com.api.med_appointment.domain.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@Table(name = "doctor")
@Entity
public class Doctor extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "crm", nullable = false, unique = true)
    @Size(max = 7, message = "CRM must contain 7 numeric digits")
    private String crm;

    @Column(name = "doctor_specialty", nullable = false)
    @Enumerated(EnumType.STRING)
    private DoctorSpecialty doctorSpecialty;

    public Doctor(@Size(max = 255, message = "Name must have a maximum of 255 characters") String name, Date dateBirth, @Size(max = 11, message = "CPF must have a maximum of 11 characters") String cpf, String phonenumber, @Size(max = 255, message = "Email must have a maximum of 255 characters") String email, Long id, String crm, DoctorSpecialty doctorSpecialty) {
        super(name, dateBirth, cpf, phonenumber, email);
        this.id = id;
        this.crm = crm;
        this.doctorSpecialty = doctorSpecialty;
    }

    public Doctor(Long id, String crm, DoctorSpecialty doctorSpecialty) {
        this.id = id;
        this.crm = crm;
        this.doctorSpecialty = doctorSpecialty;
    }
}
