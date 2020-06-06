package com.clinicmanagementsystem.dao.repository;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Patient;
import com.clinicmanagementsystem.dao.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository {

    Page<Patient> findById(Long id, Pageable pageable);

    Optional<Patient> getPatient(Person person);

    Patient savePatient(Person person, Address address);

    Patient updatePatient(Patient patient);

    void deletePatient(Long id);

   Page<Patient> getAll(Pageable pageable);
}
