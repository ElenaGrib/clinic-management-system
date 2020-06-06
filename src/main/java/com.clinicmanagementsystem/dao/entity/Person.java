package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Data
@Embeddable
public class Person {
    @Column (name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column
    private LocalDate birthday;

    @Column
    private String gender;

    @Column
    @Email (message = "Email should be valid")
    private String email;
}

