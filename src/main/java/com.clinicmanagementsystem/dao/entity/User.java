package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Data
@Entity
@Table (name = "user")
public class User extends BaseEntity {
    @Column
    private String login;

    @Column
    @Email (message = "Email should be valid")
    private String email;

    @Column
    private String password;

    @ManyToOne
    @JoinColumn (name = "role_id")
    private Role role;
}