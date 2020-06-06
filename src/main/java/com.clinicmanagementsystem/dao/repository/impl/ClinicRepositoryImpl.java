package com.clinicmanagementsystem.dao.repository.impl;

import com.clinicmanagementsystem.dao.entity.Address;
import com.clinicmanagementsystem.dao.entity.Clinic;
import com.clinicmanagementsystem.dao.repository.ClinicRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ClinicRepositoryImpl implements ClinicRepository {

    @Autowired
    private final SessionFactory sessionFactory;

    @Override
    public Optional<Clinic> getClinic(String name) {
        return sessionFactory.getCurrentSession()
                .createQuery("select e from " + Clinic.class.getSimpleName() + " e where e.name = :name", Clinic.class)
                .setParameter("name", name)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public Clinic saveClinic(String name, Address address) {
        Clinic clinic = new Clinic();
        sessionFactory.getCurrentSession()
                .save(clinic);
        return clinic;
    }

    @Override
    public Clinic updateClinic(Clinic clinic) {
        sessionFactory.getCurrentSession().createQuery("update e" + Clinic.class);
        return clinic;
    }

    @Override
    public void deleteClinic(Long id) {
        sessionFactory.getCurrentSession().createQuery("delete e" + Clinic.class.getSimpleName() + "e where e.id=:id", Clinic.class);
    }

    @Override
    public List<Clinic> getAll() {
        List list = sessionFactory.getCurrentSession()
                .createQuery("from Clinic" + Clinic.class)
                .list();
        return list;
    }
}
