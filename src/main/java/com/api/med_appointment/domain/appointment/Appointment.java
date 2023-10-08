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
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @NotNull(message = "Patient cannot be null")
    private Patient patientId;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    @NotNull(message = "Doctor cannot be null")
    private Doctor doctorId;

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "observation", nullable = false)
    @NotBlank(message = "Observation cannot be blank")
    private String obs;

    @Column(name = "appointment_status", nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Appointment status cannot be null")
    private AppointmentStatus appointmentStatus;
}
