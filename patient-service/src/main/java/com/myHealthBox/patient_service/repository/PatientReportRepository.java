package com.myHealthBox.patient_service.repository;

import com.myHealthBox.patient_service.entity.PatientReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientReportRepository extends JpaRepository<PatientReport, UUID> {
}
