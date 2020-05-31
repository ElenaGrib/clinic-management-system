package com.clinicmanagementsystem.dao.repository.impl;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Patient;
import com.clinicmanagementsystem.dao.entity.Person;
import com.clinicmanagementsystem.dao.repository.PatientRepository;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class PatientRepositoryImpl implements PatientRepository {

    private SessionFactory sessionFactory;

    @Override
    public Optional <Patient> getPatient(Person person) {
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
    public List <Patient> getAll() {
        List list = sessionFactory.getCurrentSession()
                .createQuery("from Patient" + Patient.class)
                .list();
        return list;
    }
}

