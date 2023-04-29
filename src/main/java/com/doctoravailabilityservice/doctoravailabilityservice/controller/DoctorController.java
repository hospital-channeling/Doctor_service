package com.doctoravailabilityservice.doctoravailabilityservice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DoctorController {

//    private DoctorService doctorService;
//
//    @GetMapping("/{username}/availabilities")
//    public ResponseEntity<List<Availability>> getAvailabilities(@PathVariable String username, @RequestParam LocalDate date) {
//        List<Availability> availabilities = doctorService.getAvailabilities(username, date);
//        return new ResponseEntity<>(availabilities, HttpStatus.OK);
//    }
//    @PostMapping("/{username}/availabilities")
//    public ResponseEntity<Availability> createAvailability(@PathVariable String username, @RequestBody Availability availability) {
//        Availability createdAvailability = doctorService.createAvailability(username, availability);
//        return new ResponseEntity<>(createdAvailability, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{username}/availabilities/{id}")
//    public ResponseEntity<Availability> updateAvailability(@PathVariable String username, @PathVariable Long id, @RequestBody Availability availability) {
//        Availability updatedAvailability = doctorService.updateAvailability(username, id, availability);
//        if (updatedAvailability != null) {
//            return new ResponseEntity<>(updatedAvailability, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @DeleteMapping("/{username}/availabilities/{id}")
//    public ResponseEntity<Void> deleteAvailability(@PathVariable String username, @PathVariable Long id) {
//        doctorService.deleteAvailability(username, id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }


}
