package com.myHealthBox.doctor_service.repository;

import com.myHealthBox.doctor_service.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpecializationRepository extends JpaRepository<Specialization, UUID> {
}
