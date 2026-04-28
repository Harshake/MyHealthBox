package com.myHealthBox.auth_service.repository;

import com.myHealthBox.auth_service.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}
