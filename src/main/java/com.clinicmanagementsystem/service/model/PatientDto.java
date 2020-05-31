package com.clinicmanagementsystem.service.model;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Person;
import lombok.Data;

@Data
public class PatientDto {
    private Person person;
    private Address address;
}
