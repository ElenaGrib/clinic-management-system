package com.clinicmanagementsystem.service.model;

import lombok.Data;

@Data
public class UserDto {
    public String login;

    public String email;

    public String password;

    public String status;
}
