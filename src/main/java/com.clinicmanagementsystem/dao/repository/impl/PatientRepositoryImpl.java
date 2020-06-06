package com.clinicmanagementsystem.dao.repository.impl;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Patient;
import com.clinicmanagementsystem.dao.entity.Person;
import com.clinicmanagementsystem.dao.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PatientRepositoryImpl implements PatientRepository {

    @Autowired
    private final SessionFactory sessionFactory;

    @Override
    public Page findById(Long id, Pageable pageable) {
        return (Page) sessionFactory.getCurrentSession()
                .createQuery("select e from" + Patient.class.getSimpleName() + " where e.id=:id", Patient.class)
                .list();
    }


    @Override
    public Optional<Patient> getPatient(Person person) {
        return sessionFactory.getCurrentSession()
                .createQuery("select e from " + Patient.class.getSimpleName() + " e where (e.firstName = :firstName and e.lastName=:lastName)", Patient.class)
                .setParameter("person", person)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public Patient savePatient(Person person, Address address) {
        Patient patient = new Patient();
        sessionFactory.getCurrentSession()
                .save(patient);
        return patient;
    }

    @Override
    public Patient updatePatient(Patient patient) {
        sessionFactory.getCurrentSession().createQuery("update e" + Patient.class);
        return patient;
    }

    @Override
    public void deletePatient(Long id) {
        sessionFactory.getCurrentSession().createQuery("delete e" + Patient.class.getSimpleName() + "e where e.id=:id", Patient.class);
    }

    @Override
    public Page getAll(Pageable pageable) {
        Page page = (Page) sessionFactory.getCurrentSession()
                .createQuery("from Patient" + Patient.class)
                .list();
        return page;
    }
}

