package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table (name = "patient")
public class Patient extends BaseEntity {
    @Embedded
    private Person person;

    @Embedded
    private Address address;

    @OneToMany (mappedBy = "id")
    private List<Doctor> doctors;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="fk_patient_id")
    private PatientDetails patientDetails;
}
