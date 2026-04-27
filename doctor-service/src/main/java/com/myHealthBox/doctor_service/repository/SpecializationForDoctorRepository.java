package com.myHealthBox.doctor_service.repository;

import com.myHealthBox.doctor_service.entity.SpecializationForDoctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpecializationForDoctorRepository extends JpaRepository<SpecializationForDoctor, UUID> {
}
