package com.doctoravailabilityservice.doctoravailabilityservice.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "doctor")

public class DoctorAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "doctor_id", nullable = false)
    private Integer doctorId;

    @Column(name = "availability_date", nullable = false)
    private LocalDate availabilityDate;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalTime endTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "reason")
    private String reason;

    public enum Status {
        AVAILABLE,
        UNAVAILABLE
    }

    // getters
    public Integer getId() {
        return id;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public LocalDate getAvailabilityDate() {
        return availabilityDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Status getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    // setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public void setAvailabilityDate(LocalDate availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


}
