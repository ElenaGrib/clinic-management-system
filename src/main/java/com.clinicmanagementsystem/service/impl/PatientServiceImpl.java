package com.clinicmanagementsystem.service.impl;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Patient;
import com.clinicmanagementsystem.dao.entity.Person;
import com.clinicmanagementsystem.dao.repository.PatientRepository;
import com.clinicmanagementsystem.service.api.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private PatientRepository repository;

    @Override
    public Patient create(Person person, Address address) {
        repository.getPatient(person)
                .ifPresent(patientUser -> {
                    throw new RuntimeException(String.format("Такой пациент %s уже существует!", patientUser.getClass()));
                });
        return repository.savePatient(person, address);
    }

    @Override
    public Patient update(Patient patient) {
        return repository.updatePatient(patient);
    }

    @Override
    public void delete(Long id) {
        repository.deletePatient(id);
    }

    @Override
    public List <Patient> getAll() {
        return repository.getAll();
    }

}
