package com.myHealthBox.patient_service.entity;

import com.myHealthBox.patient_service.enums.AppointmentStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "appointment")
public class Appointment extends GlobalEntity{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientProfile patient;

    private LocalDateTime appointmentTime;

    private Boolean openForOther;

    @Enumerated(value = EnumType.STRING)
    private AppointmentStatus status;

    private Boolean isDeleted;

    @Column(columnDefinition = "TEXT")
    private String rejectionNote;

    private UUID doctorId;
}
