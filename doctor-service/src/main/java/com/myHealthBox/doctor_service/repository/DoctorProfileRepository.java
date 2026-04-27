package com.myHealthBox.doctor_service.repository;

import com.myHealthBox.doctor_service.entity.DoctorProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DoctorProfileRepository extends JpaRepository<DoctorProfile, UUID> {
}
