package com.api.med_appointment.domain.person;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person {

    @Size(max = 255, message = "Name must have a maximum of 255 characters")
    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateBirth;

    @Size(max = 11, message = "CPF must have a maximum of 11 characters")
    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(name = "phone_number")
    private String phonenumber;

    @Size(max = 255, message = "Email must have a maximum of 255 characters")
    @Column(name = "email", length = 255, nullable = false)
    private String email;

}
