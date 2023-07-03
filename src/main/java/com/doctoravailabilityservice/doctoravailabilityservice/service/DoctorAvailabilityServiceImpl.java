package com.doctoravailabilityservice.doctoravailabilityservice.service;

import com.doctoravailabilityservice.doctoravailabilityservice.entity.DoctorAvailability;
import com.doctoravailabilityservice.doctoravailabilityservice.repository.DoctorAvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorAvailabilityServiceImpl implements DoctorAvailabilityService {

    private final DoctorAvailabilityRepository doctorAvailabilityRepository;

    @Autowired
    public DoctorAvailabilityServiceImpl(DoctorAvailabilityRepository doctorAvailabilityRepository) {
        this.doctorAvailabilityRepository = doctorAvailabilityRepository;
    }

    @Override
    public DoctorAvailability createAvailability(DoctorAvailability doctorAvailability) {
        return doctorAvailabilityRepository.save(doctorAvailability);
    }

    @Override
    public List<DoctorAvailability> getAvailabilitiesByDoctorId(Integer doctorId) {
        return doctorAvailabilityRepository.findByDoctorId(doctorId);
    }

    @Override
    public Optional<DoctorAvailability> getAvailabilityById(Integer availabilityId) {
        return doctorAvailabilityRepository.findById(availabilityId);
    }

    @Override
    public boolean existsById(Integer availabilityId) {
        return doctorAvailabilityRepository.existsById(availabilityId);
    }

    @Override
    public DoctorAvailability updateAvailability(DoctorAvailability doctorAvailability) {
        return doctorAvailabilityRepository.save(doctorAvailability);
    }

    @Override
    public void deleteAvailability(Integer availabilityId) {
        doctorAvailabilityRepository.deleteById(availabilityId);
    }
}
