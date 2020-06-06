package com.clinicmanagementsystem.service.api;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Clinic;

import java.util.List;

public interface ClinicService {
    Clinic create(String name, Address address);

    Clinic update(Clinic clinic);

    void delete(Long id);

    List<Clinic> getAll();
}
