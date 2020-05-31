package com.clinicmanagementsystem.dao.repository.impl;

import com.clinicmanagementsystem.dao.entity.Diagnosis;
import com.clinicmanagementsystem.dao.repository.DiagnosisRepository;
import org.hibernate.SessionFactory;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class DiagnosisRepositoryImpl implements DiagnosisRepository {

    private SessionFactory sessionFactory;

    @Override
    public Optional <Diagnosis> getDiagnosis(Long patientId) {
        return sessionFactory.getCurrentSession()
                .createQuery("select e from " + Diagnosis.class.getSimpleName() + " e where e.patientId = :patientId", Diagnosis.class)
                .setParameter("patientId", patientId)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public Diagnosis saveDiagnosis(Long patientId, Date date, String analyzes, String diagnosis, String recipe) {
        Diagnosis diagnosisObject = new Diagnosis();
        sessionFactory.getCurrentSession()
                .save(diagnosisObject);
        return diagnosisObject;
    }

    @Override
    public Diagnosis updateDiagnosis(Diagnosis diagnosis) {
        sessionFactory.getCurrentSession().createQuery("update e" + Diagnosis.class);
        return diagnosis;
    }

    @Override
    public void deleteDiagnosis(Long id) {
        sessionFactory.getCurrentSession().createQuery("delete e" + Diagnosis.class.getSimpleName() + "e where e.id=:id", Diagnosis.class);
    }

    @Override
    public List <Diagnosis> getAll() {
        List list = sessionFactory.getCurrentSession()
                .createQuery("from Diagnosis" + Diagnosis.class)
                .list();
        return list;
    }
}
