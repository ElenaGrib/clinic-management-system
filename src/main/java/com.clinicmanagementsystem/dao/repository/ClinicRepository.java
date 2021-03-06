package com.clinicmanagementsystem.dao.repository;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Clinic;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClinicRepository {
    Optional<Clinic> getClinic(String name);

    Clinic saveClinic(String name, Address address);

    Clinic updateClinic(Clinic clinic);

    void deleteClinic(Long id);

    List<Clinic> getAll();
}
