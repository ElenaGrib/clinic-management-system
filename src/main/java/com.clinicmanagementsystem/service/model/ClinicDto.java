package com.clinicmanagementsystem.service.model;

import com.clinicmanagementsystem.dao.entity.Address;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ClinicDto {
    @NotEmpty
    private String name;
    private Address address;
}
