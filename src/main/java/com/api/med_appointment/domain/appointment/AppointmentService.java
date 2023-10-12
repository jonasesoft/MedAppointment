package com.api.med_appointment.domain.appointment;

import com.api.med_appointment.domain.person.doctor.Doctor;
import com.api.med_appointment.domain.person.doctor.DoctorRepository;
import com.api.med_appointment.domain.person.patient.Patient;
import com.api.med_appointment.domain.person.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository, PatientRepository patientRepository, DoctorRepository doctorRepository) {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
    }

    public AppointmentDTO createAppointment(AppointmentDTO appointmentDTO) {
        // Recupere o paciente e médico com base nos IDs do DTO
        Optional<Patient> patient = patientRepository.findById(appointmentDTO.getPatientDTOId().getId());
        Optional<Doctor> doctor = doctorRepository.findById(appointmentDTO.getDoctorDTOId().getId());

        if (patient.isPresent() && doctor.isPresent()) {
            Appointment appointment = new Appointment();
            appointment.setPatientId(patient.get());
            appointment.setDoctorId(doctor.get());
            appointment.setDate(appointmentDTO.getDate());
            appointment.setObservation(appointmentDTO.getObs());
            appointment.setAppointmentStatus(appointmentDTO.getAppointmentStatus());

            appointment = appointmentRepository.save(appointment);

            return new AppointmentDTO(appointment);
        } else {
            throw new IllegalArgumentException("Patient or Doctor not found with provided IDs.");
        }
    }

    public AppointmentDTO getAppointmentById(Long id) {
        Optional<Appointment> appointment = appointmentRepository.findById(id);
        if (appointment.isPresent()) {
            return new AppointmentDTO(appointment.get());
        } else {
            throw new IllegalArgumentException("Appointment not found with the provided ID.");
        }
    }

    public List<AppointmentDTO> getAllAppointments() {
        List<Appointment> appointments = appointmentRepository.findAll();
        return appointments.stream()
                .map(AppointmentDTO::new)
                .collect(Collectors.toList());
    }

    public AppointmentDTO updateAppointment(Long id, AppointmentDTO appointmentDTO) {
        Optional<Appointment> existingAppointmentOptional = appointmentRepository.findById(id);
        if (existingAppointmentOptional.isPresent()) {
            Appointment existingAppointment = existingAppointmentOptional.get();
            existingAppointment.setDate(appointmentDTO.getDate());
            existingAppointment.setObservation(appointmentDTO.getObs());
            existingAppointment.setAppointmentStatus(appointmentDTO.getAppointmentStatus());

            existingAppointment = appointmentRepository.save(existingAppointment);

            return new AppointmentDTO(existingAppointment);
        } else {
            throw new IllegalArgumentException("Appointment not found with the provided ID.");
        }
    }

    public void deleteAppointment(Long id) {
        Optional<Appointment> appointment = appointmentRepository.findById(id);
        if (appointment.isPresent()) {
            appointmentRepository.delete(appointment.get());
        } else {
            throw new IllegalArgumentException("Appointment not found with the provided ID.");
        }
    }
}
