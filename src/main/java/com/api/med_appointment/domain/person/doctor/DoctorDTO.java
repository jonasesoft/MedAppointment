package com.api.med_appointment.domain.person.doctor;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class DoctorDTO {
    private Long id;
    private String name;

    private Date dateBirth;
    private String cpf;
    private String phonenumber;
    private String email;
    private String crm;
    private DoctorSpecialty doctorSpecialty;

    public DoctorDTO(){

    }

    public DoctorDTO(Long id, String name, Date dateBirth, String cpf, String phonenumber, String email, String crm, DoctorSpecialty doctorSpecialty) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
        this.cpf = cpf;
        this.phonenumber = phonenumber;
        this.email = email;
        this.crm = crm;
        this.doctorSpecialty = doctorSpecialty;
    }

    public DoctorDTO(Doctor doctor) {
        id = doctor.getId();
        name = doctor.getName();
        dateBirth = doctor.getDateBirth();
        cpf = doctor.getCpf();
        phonenumber = doctor.getPhonenumber();
        email = doctor.getEmail();
        crm = doctor.getCrm();
        doctorSpecialty = doctor.getDoctorSpecialty();
    }
}
