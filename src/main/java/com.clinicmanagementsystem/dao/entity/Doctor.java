package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "doctor")
public class Doctor extends BaseEntity {

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "fk_clinic_id")
    private Clinic clinic;

    @Embedded
    private Person person;

    @Embedded
    private Address address;
}
