package com.clinicmanagementsystem.service.impl;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Doctor;
import com.clinicmanagementsystem.dao.entity.Person;
import com.clinicmanagementsystem.dao.repository.DoctorRepository;
import com.clinicmanagementsystem.service.api.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private final DoctorRepository repository;

    @Override
    public Doctor create(Person person, String position, Address address) {
        repository.getDoctor(person)
                .ifPresent(doctorUser -> {
                    throw new RuntimeException(String.format("Такой доктор %s уже существует!", doctorUser.getClass()));
                });
        return repository.saveDoctor(person, position, address);
    }

    @Override
    public Doctor update(Doctor doctor) {
        return repository.updateDoctor(doctor);
    }

    @Override
    public void delete(Long id) {
        repository.deleteDoctor(id);
    }

    @Override
    public List<Doctor> getAll() {
        return repository.getAll();
    }
}
