package com.doctoravailabilityservice.doctoravailabilityservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor_availability")
public class DoctorAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "doctor_id")
    private Integer doctorId;

    @Column(name = "doc_date")
    private String docDate;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
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

    public String getDocDate() {
        return docDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
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

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
