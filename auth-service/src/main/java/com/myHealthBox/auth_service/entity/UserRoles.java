package com.myHealthBox.auth_service.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_role")
public class UserRoles extends GlobalEntity{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    private UUID tenantId;
}
