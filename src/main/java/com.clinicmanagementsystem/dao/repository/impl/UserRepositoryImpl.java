package com.clinicmanagementsystem.dao.repository.impl;

import com.clinicmanagementsystem.dao.entity.User;
import com.clinicmanagementsystem.dao.repository.UserRepository;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

    private SessionFactory sessionFactory;

    @Override
    public Optional <User> getUser(String login) {
        return sessionFactory.getCurrentSession()
                .createQuery("select e from " + User.class.getSimpleName() + " e where (e.login = :login and e.password=:password)", User.class)
                .setParameter("login", login)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public User saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        sessionFactory.getCurrentSession().createQuery("update e" + User.class);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        sessionFactory.getCurrentSession().createQuery("delete e" + User.class.getSimpleName() + "e where e.id=:id", User.class);
    }

    @Override
    public List <User> getAll() {
        List list = sessionFactory.getCurrentSession()
                .createQuery("from User" + User.class)
                .list();
        return list;
    }
}