package com.myHealthBox.doctor_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public class TenantEntity  extends GlobalEntity{
    @Column(name = "tenant_id", nullable = false)
    private UUID tenantId;
}
