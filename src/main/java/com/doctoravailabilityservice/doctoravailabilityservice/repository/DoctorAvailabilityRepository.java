package com.doctoravailabilityservice.doctoravailabilityservice.repository;

import com.doctoravailabilityservice.doctoravailabilityservice.entity.DoctorAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorAvailabilityRepository extends JpaRepository<DoctorAvailability, Integer> {
    List<DoctorAvailability> findByDoctorId(Integer doctorId);
}
