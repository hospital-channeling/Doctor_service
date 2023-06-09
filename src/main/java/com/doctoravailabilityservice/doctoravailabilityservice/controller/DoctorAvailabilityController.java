package com.doctoravailabilityservice.doctoravailabilityservice.controller;

import com.doctoravailabilityservice.doctoravailabilityservice.entity.DoctorAvailability;
import com.doctoravailabilityservice.doctoravailabilityservice.service.DoctorAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors/{doctorId}/availability")
public class DoctorAvailabilityController {

    private final DoctorAvailabilityService doctorAvailabilityService;

    @Autowired
    public DoctorAvailabilityController(DoctorAvailabilityService doctorAvailabilityService) {
        this.doctorAvailabilityService = doctorAvailabilityService;
    }

    @PostMapping
    public ResponseEntity<DoctorAvailability> createAvailability(@PathVariable Integer doctorId,
                                                                 @RequestBody DoctorAvailability doctorAvailability) {
        doctorAvailability.setDoctorId(doctorId);
        DoctorAvailability createdAvailability = doctorAvailabilityService.createAvailability(doctorAvailability);
        return new ResponseEntity<>(createdAvailability, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DoctorAvailability>> getAvailabilities(@PathVariable Integer doctorId) {
        List<DoctorAvailability> availabilities = doctorAvailabilityService.getAvailabilitiesByDoctorId(doctorId);
        return new ResponseEntity<>(availabilities, HttpStatus.OK);
    }

    @GetMapping("/{availabilityId}")
    public ResponseEntity<DoctorAvailability> getAvailabilityById(@PathVariable Integer doctorId,
                                                                  @PathVariable Integer availabilityId) {
        if (!doctorAvailabilityService.existsById(availabilityId)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        DoctorAvailability availability = doctorAvailabilityService.getAvailabilityById(availabilityId)
                .orElseThrow();
        return new ResponseEntity<>(availability, HttpStatus.OK);
    }

    @PutMapping("/{availabilityId}")
    public ResponseEntity<DoctorAvailability> updateAvailability(@PathVariable Integer doctorId,
                                                                 @PathVariable Integer availabilityId,
                                                                 @RequestBody DoctorAvailability doctorAvailability) {
        if (!doctorAvailabilityService.existsById(availabilityId)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        doctorAvailability.setId(availabilityId);
        doctorAvailability.setDoctorId(doctorId);
        DoctorAvailability updatedAvailability = doctorAvailabilityService.updateAvailability(doctorAvailability);
        return new ResponseEntity<>(updatedAvailability, HttpStatus.OK);
    }

    @DeleteMapping("/{availabilityId}")
    public ResponseEntity<Void> deleteAvailability(@PathVariable Integer doctorId,
                                                   @PathVariable Integer availabilityId) {
        if (!doctorAvailabilityService.existsById(availabilityId)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        doctorAvailabilityService.deleteAvailability(availabilityId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
