package com.myHealthBox.doctor_service.repository;

import com.myHealthBox.doctor_service.entity.DoctorAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DoctorAvailabilityRepository extends JpaRepository<DoctorAvailability, UUID> {
}
