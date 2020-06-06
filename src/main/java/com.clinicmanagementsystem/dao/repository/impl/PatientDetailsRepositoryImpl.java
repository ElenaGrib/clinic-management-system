package com.clinicmanagementsystem.dao.repository.impl;

import com.clinicmanagementsystem.dao.entity.PatientDetails;
import com.clinicmanagementsystem.dao.repository.PatientDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PatientDetailsRepositoryImpl implements PatientDetailsRepository {

    @Autowired
    private final SessionFactory sessionFactory;

    @Override
    public Optional<PatientDetails> getDetails(Long patientId) {
        return sessionFactory.getCurrentSession()
                .createQuery("select e from " + PatientDetails.class.getSimpleName() + " e where e.patientId = :patientId", PatientDetails.class)
                .setParameter("patientId", patientId)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public PatientDetails saveDetails(PatientDetails patientDetails) {
        sessionFactory.getCurrentSession()
                .save(patientDetails);
        return patientDetails;
    }

    public PatientDetails updateDetails(PatientDetails patientDetails) {
        sessionFactory.getCurrentSession().createQuery("update e" + PatientDetails.class);
        return patientDetails;
    }

    public void deleteDetails(Long id) {
        sessionFactory.getCurrentSession().createQuery("delete e" + PatientDetails.class.getSimpleName() + "e where e.id=:id", PatientDetails.class);
    }

    public List<PatientDetails> getAll() {
        List list = sessionFactory.getCurrentSession()
                .createQuery("from PatientDetails" + PatientDetails.class)
                .list();
        return list;
    }
}


