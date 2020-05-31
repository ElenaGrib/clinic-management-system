package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.sql.Date;

@Data
@Embeddable
public class Person {
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;
    @Column
    private Date birthday;

    @Column
    private String gender;

    @Column
    private String email;
}

