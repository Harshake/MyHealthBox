package com.myHealthBox.patient_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "patient_report")
public class PatientReport extends GlobalEntity{
    private Boolean isVerified;

    private String reportType;

    @Column(columnDefinition = "TEXT")
    private String fileUrl;

    private Boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientProfile patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_id", nullable = false)
    private Prescription prescription;
}
