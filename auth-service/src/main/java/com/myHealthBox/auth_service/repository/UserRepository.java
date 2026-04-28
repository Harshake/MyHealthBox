package com.myHealthBox.auth_service.repository;

import com.myHealthBox.auth_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
