package com.clinicmanagementsystem.dao.repository.impl;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Doctor;
import com.clinicmanagementsystem.dao.entity.Person;
import com.clinicmanagementsystem.dao.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DoctorRepositoryImpl implements DoctorRepository {

    private SessionFactory sessionFactory;

    @Override
    public Optional <Doctor> getDoctor(Person person) {
        return sessionFactory.getCurrentSession()
                .createQuery("select e from " + Doctor.class.getSimpleName() + " e where (e.firstName = :firstName and e.lastName=:lastName)", Doctor.class)
                .setParameter("person", person)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public Doctor saveDoctor(Person person, String position, Address address) {
        Doctor doctor = new Doctor();
        sessionFactory.getCurrentSession()
                .save(doctor);
        return doctor;
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        sessionFactory.getCurrentSession().createQuery("update e" + Doctor.class);
        return doctor;
    }

    @Override
    public void deleteDoctor(Long id) {
        sessionFactory.getCurrentSession().createQuery("delete e" + Doctor.class.getSimpleName() + "e where e.id=:id", Doctor.class);
    }

    @Override
    public List <Doctor> getAll() {
        List list = sessionFactory.getCurrentSession()
                .createQuery("from Doctor" + Doctor.class)
                .list();
        return list;
    }
}

