package com.clinicmanagementsystem.service.api;

import com.clinicmanagementsystem.dao.entity.Diagnosis;

import java.util.Date;
import java.util.List;

public interface DiagnosisService {
    Diagnosis create(Long patientId, Date date, String analyzes, String diagnosis, String recipe);

    Diagnosis update(Diagnosis diagnosis);

    void delete(Long id);

    List<Diagnosis> getAll();
}

