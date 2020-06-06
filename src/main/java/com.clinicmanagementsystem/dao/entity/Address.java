package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {
    @Column
    private String phone;

    @Column
    private String country;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private String building;
}