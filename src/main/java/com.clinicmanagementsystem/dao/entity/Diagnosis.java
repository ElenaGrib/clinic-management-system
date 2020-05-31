package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table (name = "diagnosis")
public class Diagnosis extends BaseEntity {
    @Column
    private Date date;
    @Column
    private String analyzes;
    @Column
    private String diagnosis;
    @Column
    private String recipe;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "patient_id")
    private Patient patient;
}