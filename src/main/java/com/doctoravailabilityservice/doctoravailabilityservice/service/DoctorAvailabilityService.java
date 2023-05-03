package com.doctoravailabilityservice.doctoravailabilityservice.service;

import com.doctoravailabilityservice.doctoravailabilityservice.entity.DoctorAvailability;
import com.doctoravailabilityservice.doctoravailabilityservice.repository.DoctorAvailabilityRepository;
import com.doctoravailabilityservice.doctoravailabilityservice.entity.DoctorAvailability;
import com.doctoravailabilityservice.doctoravailabilityservice.repository.DoctorAvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DoctorAvailabilityService {

    @Autowired
    private DoctorAvailabilityRepository doctorAvailabilityRepository;

    public DoctorAvailability createAvailability(DoctorAvailability doctorAvailability) {
        return doctorAvailabilityRepository.save(doctorAvailability);
    }

    public List<DoctorAvailability> getAvailabilitiesByDoctorId(Integer doctorId) {
        // Implement the logic to fetch availabilities for a doctor
        return null;
    }

    public Optional<DoctorAvailability> getAvailabilityById(Integer id) {
        return doctorAvailabilityRepository.findById(id);
    }

    public DoctorAvailability updateAvailability(DoctorAvailability doctorAvailability) {
        return doctorAvailabilityRepository.save(doctorAvailability);
    }

    public void deleteAvailability(Integer id) {
        doctorAvailabilityRepository.deleteById(id);
    }


}
