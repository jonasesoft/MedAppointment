package com.api.med_appointment.domain.appointment;

import com.api.med_appointment.domain.person.doctor.Doctor;
import com.api.med_appointment.domain.person.patient.Patient;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "appointment")
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @NotNull(message = "Patient cannot be null")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    @NotNull(message = "Doctor cannot be null")
    private Doctor doctor;

    @Temporal(TemporalType.TIMESTAMP)
    @Future(message = "Appointment date must be in the future")
    private Date date;

    @NotBlank(message = "Observation cannot be blank")
    private String obs;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Appointment status cannot be null")
    private AppointmentStatus appointmentStatus;
}
