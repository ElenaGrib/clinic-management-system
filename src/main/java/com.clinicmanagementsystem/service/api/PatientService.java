package com.clinicmanagementsystem.service.api;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Patient;
import com.clinicmanagementsystem.dao.entity.Person;

import java.util.List;

public interface PatientService {
    Patient create(Person person, Address address);

    Patient update(Patient patient);

    void delete(Long id);

    static List<Patient> getAll();
}