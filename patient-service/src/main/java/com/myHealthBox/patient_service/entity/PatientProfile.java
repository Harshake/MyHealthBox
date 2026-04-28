package com.myHealthBox.patient_service.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "patient_profile")
public class PatientProfile extends GlobalEntity{
    private String name;

    private Integer age;

    private String bloodGroup;

    private String contactNo;

    private Boolean isDeleted;

    @Column(nullable = false)
    private UUID userId;
}
