package com.clinicmanagementsystem.dao.repository;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Doctor;
import com.clinicmanagementsystem.dao.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository {
    Optional<Doctor> getDoctor(Person person);

    Doctor saveDoctor(Person person, String position, Address address);

    Doctor updateDoctor(Doctor doctor);

    void deleteDoctor(Long id);

    List<Doctor> getAll();
}