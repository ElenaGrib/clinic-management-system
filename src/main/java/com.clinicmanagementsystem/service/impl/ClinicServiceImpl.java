package com.clinicmanagementsystem.service.impl;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Clinic;
import com.clinicmanagementsystem.dao.repository.ClinicRepository;
import com.clinicmanagementsystem.service.api.ClinicService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j
public class ClinicServiceImpl implements ClinicService {

    @Autowired
    private final ClinicRepository repository;

    @Override
    @Transactional
    public Clinic create(String name, Address address) {
        repository.getClinic(name)
                .ifPresent(clinicName -> {
                    throw new RuntimeException(String.format("Такая клиника %s уже существует!", clinicName.getClass()));
                });
        return repository.saveClinic(name, address);
    }

    @Override
    public Clinic update(Clinic clinic) {
        return repository.updateClinic(clinic);
    }

    @Override
    public void delete(Long id) {
        repository.deleteClinic(id);
    }

    @Override
    public List<Clinic> getAll() {
        return repository.getAll();
    }
}
