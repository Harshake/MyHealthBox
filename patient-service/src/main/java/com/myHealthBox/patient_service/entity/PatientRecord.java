package com.myHealthBox.patient_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "patient_record")
public class PatientRecord extends GlobalEntity{
    @Column(columnDefinition = "TEXT")
    private String medicalHistory;

    @Column(columnDefinition = "TEXT")
    private String note;

    private Boolean isDeleted;

    @OneToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientProfile patient;
}
