package com.myHealthBox.patient_service.repository;

import com.myHealthBox.patient_service.entity.PatientDocument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientDocumentRepository extends JpaRepository<PatientDocument, UUID> {
}
