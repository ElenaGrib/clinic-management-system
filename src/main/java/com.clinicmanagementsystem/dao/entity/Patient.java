package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    private List <Doctor> doctors;

}
