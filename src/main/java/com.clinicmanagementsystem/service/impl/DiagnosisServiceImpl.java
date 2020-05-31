package com.clinicmanagementsystem.service.impl;

import com.clinicmanagementsystem.dao.entity.Diagnosis;
import com.clinicmanagementsystem.dao.repository.DiagnosisRepository;
import com.clinicmanagementsystem.service.api.DiagnosisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DiagnosisServiceImpl implements DiagnosisService {

    private DiagnosisRepository repository;

    @Override
    public Diagnosis create(Long patientId, Date date, String analyzes, String diagnosis, String recipe) {
        return repository.saveDiagnosis(patientId, date, analyzes, diagnosis, recipe);
    }

    @Override
    public Diagnosis update(Diagnosis diagnosis) {
        return repository.updateDiagnosis(diagnosis);
    }

    @Override
    public void delete(Long id) {
        repository.deleteDiagnosis(id);
    }

    @Override
    public List <Diagnosis> getAll() {
        return repository.getAll();
    }
}
