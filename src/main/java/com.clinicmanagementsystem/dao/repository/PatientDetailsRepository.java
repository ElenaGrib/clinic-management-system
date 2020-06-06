package com.clinicmanagementsystem.dao.repository;

import com.clinicmanagementsystem.dao.entity.PatientDetails;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientDetailsRepository {

    Optional<PatientDetails> getDetails(Long patientId);

    PatientDetails saveDetails(PatientDetails patientDetails);

    PatientDetails updateDetails(PatientDetails patientDetails);

    void deleteDetails(Long id);

    List<PatientDetails> getAll();
}
