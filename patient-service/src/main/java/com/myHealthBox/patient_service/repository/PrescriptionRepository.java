package com.myHealthBox.patient_service.repository;

import com.myHealthBox.patient_service.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrescriptionRepository extends JpaRepository<Prescription, UUID> {
}
