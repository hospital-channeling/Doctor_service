package com.doctoravailabilityservice.doctoravailabilityservice.repository;


import com.doctoravailabilityservice.doctoravailabilityservice.entity.DoctorAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DoctorAvailabilityRepository extends JpaRepository<DoctorAvailability, Integer> {
}
