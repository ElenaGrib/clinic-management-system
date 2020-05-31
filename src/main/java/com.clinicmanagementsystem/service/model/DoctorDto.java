package com.clinicmanagementsystem.service.model;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Person;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class DoctorDto {
    private Person person;
    @NotEmpty
    private String position;
    private Address address;

}
