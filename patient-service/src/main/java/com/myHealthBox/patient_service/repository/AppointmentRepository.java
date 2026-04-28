package com.myHealthBox.patient_service.repository;

import com.myHealthBox.patient_service.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppointmentRepository extends JpaRepository<Appointment, UUID> {
}
