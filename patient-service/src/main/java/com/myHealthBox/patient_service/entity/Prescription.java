package com.myHealthBox.patient_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prescription")
public class Prescription extends GlobalEntity{
    @Column(columnDefinition = "TEXT")
    private String comments;

    @Column(columnDefinition = "TEXT")
    private String file_url;

    private Boolean isDeleted;

    @OneToOne
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;
}
