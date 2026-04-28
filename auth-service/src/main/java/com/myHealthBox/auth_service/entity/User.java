package com.myHealthBox.auth_service.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User extends GlobalEntity{
    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    private Boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    private UUID tenantId;
}
