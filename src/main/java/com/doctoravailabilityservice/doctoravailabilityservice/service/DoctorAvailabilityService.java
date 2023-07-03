package com.doctoravailabilityservice.doctoravailabilityservice.service;

import com.doctoravailabilityservice.doctoravailabilityservice.entity.DoctorAvailability;
import java.util.List;
import java.util.Optional;

public interface DoctorAvailabilityService {
    DoctorAvailability createAvailability(DoctorAvailability doctorAvailability);
    List<DoctorAvailability> getAvailabilitiesByDoctorId(Integer doctorId);
    Optional<DoctorAvailability> getAvailabilityById(Integer availabilityId);
    boolean existsById(Integer availabilityId);
    DoctorAvailability updateAvailability(DoctorAvailability doctorAvailability);
    void deleteAvailability(Integer availabilityId);
}
