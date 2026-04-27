package com.myHealthBox.doctor_service.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "patient_transfer")
public class PatientTransfer extends TenantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(columnDefinition = "TEXT")
    private String reason;

    @Column(name = "patient_id", nullable = false)
    private UUID patientId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "from_doctor_id", nullable = false)
    private DoctorProfile fromDoctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_doctor_id", nullable = false)
    private DoctorProfile toDoctor;

    private UUID appointmentId;
}
