package com.clinicmanagementsystem.dao.repository;

import com.clinicmanagementsystem.dao.entity.Diagnosis;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface DiagnosisRepository {
    Optional<Diagnosis> getDiagnosis(Long patientId);

    Diagnosis saveDiagnosis(Long patientId, Date date, String analyzes, String diagnosis, String recipe);

    Diagnosis updateDiagnosis(Diagnosis diagnosis);

    void deleteDiagnosis(Long id);

    List<Diagnosis> getAll();
}
