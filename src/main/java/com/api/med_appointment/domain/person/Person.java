package com.api.med_appointment.domain.person;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person {
    private String name;
    private Date dateBirth;
    private String cpf;
    private String phonenumber;
    private String email;
}
