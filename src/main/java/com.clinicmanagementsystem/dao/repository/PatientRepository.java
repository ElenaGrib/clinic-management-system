package com.clinicmanagementsystem.dao.repository;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Patient;
import com.clinicmanagementsystem.dao.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {
    Optional <Patient> getPatient(Person person);

    Patient savePatient(Person person, Address address);

    Patient updatePatient(Patient patient);

    void deletePatient(Long id);

    List <Patient> getAll();
}
