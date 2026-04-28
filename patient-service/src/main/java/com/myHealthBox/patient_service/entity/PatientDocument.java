package com.myHealthBox.patient_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "patient_document")
public class PatientDocument extends GlobalEntity{
    private String title;

    private String documentType;

    @Column(columnDefinition = "TEXT")
    private String fileUrl;

    private Boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private PatientProfile patient;
}
