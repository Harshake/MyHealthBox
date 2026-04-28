package com.myHealthBox.auth_service.repository;

import com.myHealthBox.auth_service.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRolesRepository extends JpaRepository<UserRoles, UUID> {
}
