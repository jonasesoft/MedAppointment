package com.api.med_appointment.domain.person.doctor;

import com.api.med_appointment.exceptions.DoctorNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public DoctorDTO createDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor();
        doctor.setName(doctorDTO.getName());
        doctor.setDateBirth(doctorDTO.getDateBirth());
        doctor.setCpf(doctorDTO.getCpf());
        doctor.setPhonenumber(doctorDTO.getPhonenumber());
        doctor.setEmail(doctorDTO.getEmail());
        doctor.setCrm(doctorDTO.getCrm());
        doctor.setDoctorSpecialty(doctorDTO.getDoctorSpecialty());

        Doctor savedDoctor = doctorRepository.save(doctor);
        return new DoctorDTO(savedDoctor);
    }

    public DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO) {
        Optional<Doctor> optionalDoctor = doctorRepository.findById(id);

        if (optionalDoctor.isPresent()) {
            Doctor doctor = optionalDoctor.get();
            doctor.setName(doctorDTO.getName());
            doctor.setDateBirth(doctorDTO.getDateBirth());
            doctor.setCpf(doctorDTO.getCpf());
            doctor.setPhonenumber(doctorDTO.getPhonenumber());
            doctor.setEmail(doctorDTO.getEmail());
            doctor.setCrm(doctorDTO.getCrm());
            doctor.setDoctorSpecialty(doctorDTO.getDoctorSpecialty());

            Doctor updatedDoctor = doctorRepository.save(doctor);
            return new DoctorDTO(updatedDoctor);
        } else {
            throw new DoctorNotFoundException("Doctor not found with ID: " + id);
        }
    }

    public DoctorDTO getDoctorById(Long id) {
        Optional<Doctor> optionalDoctor = doctorRepository.findById(id);

        if (optionalDoctor.isPresent()) {
            Doctor doctor = optionalDoctor.get();
            return new DoctorDTO(doctor);
        } else {
            throw new DoctorNotFoundException("Doctor not found with ID: " + id);
        }
    }

    public List<DoctorDTO> getAllDoctors() {
        List<Doctor> doctors = doctorRepository.findAll();
        return doctors.stream()
                .map(DoctorDTO::new)
                .collect(Collectors.toList());
    }

    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}