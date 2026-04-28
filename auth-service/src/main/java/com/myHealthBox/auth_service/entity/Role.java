package com.myHealthBox.auth_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends GlobalEntity{
    private String role;
}
