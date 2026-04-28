package com.myHealthBox.patient_service.repository;

import com.myHealthBox.patient_service.entity.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, UUID> {
}
