package com.api.med_appointment.domain.appointment;

import com.api.med_appointment.domain.person.doctor.DoctorDTO;
import com.api.med_appointment.domain.person.patient.PatientDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AppointmentDTO {
    private Long id;
    private PatientDTO patientDTOId;
    private DoctorDTO doctorDTOId;
    private Date date;
    private String obs;
    private AppointmentStatus appointmentStatus;

    public AppointmentDTO() {

    }

    public AppointmentDTO(Long id, PatientDTO patientDTOId, DoctorDTO doctorDTOid, Date date, String obs, AppointmentStatus appointmentStatus) {
        this.id = id;
        this.patientDTOId = patientDTOId;
        this.doctorDTOId = doctorDTOid;
        this.date = date;
        this.obs = obs;
        this.appointmentStatus = appointmentStatus;
    }

    public AppointmentDTO(Appointment appointment) {
        id = appointment.getId();
        patientDTOId = new PatientDTO(appointment.getPatientId());
        doctorDTOId = new DoctorDTO(appointment.getDoctorId());
        date = appointment.getDate();
        obs = appointment.getObs();
        appointmentStatus = appointment.getAppointmentStatus();
    }

}
