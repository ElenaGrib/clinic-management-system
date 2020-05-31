package com.clinicmanagementsystem.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table (name = "user")
public class User extends BaseEntity {
    @Column
    private String login;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String status;
}