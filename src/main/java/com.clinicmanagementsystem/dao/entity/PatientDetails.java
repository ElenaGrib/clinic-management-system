package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "patient_details")
public class PatientDetails extends BaseEntity {
    @Column (name = "passport_number")
    private String passportNumber;

    @Column (name = "security_number")
    private String securityNumber;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "id")
    private Patient patient;
}
