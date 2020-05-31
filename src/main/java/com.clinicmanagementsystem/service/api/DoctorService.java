package com.clinicmanagementsystem.service.api;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Doctor;
import com.clinicmanagementsystem.dao.entity.Person;

import java.util.List;

public interface DoctorService {
    Doctor create(Person person, String position, Address address);

    Doctor update(Doctor doctor);

    void delete(Long id);

    List <Doctor> getAll();
}
