package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table (name = "clinic")
public class Clinic extends BaseEntity {
    @Column
    private String name;

    @OneToMany (mappedBy = "id")
    private List<Doctor> doctors;

    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable (name = "clinic_patient",
            joinColumns = @JoinColumn (name = "fk_clinic_id"),
            inverseJoinColumns = @JoinColumn (name = "fk_patient_id")
    )

    private List<Patient> patients;

    @Embedded
    private Address address;
}
