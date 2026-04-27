package com.myHealthBox.doctor_service.repository;

import com.myHealthBox.doctor_service.entity.PatientTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientTransferRepository extends JpaRepository<PatientTransfer, UUID> {
}
