package com.doctoravailabilityservice.doctoravailabilityservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor_managment")

public class DoctorAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "doctor_id")
    private Integer doctorId;

    @Column(name = "docDate")
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

    public void setDoctorId(Integer doctorId) {
    }

    public void setId(Integer availabilityId) {
    }

    public enum Status {
        AVAILABLE,
        UNAVAILABLE
    }


}
