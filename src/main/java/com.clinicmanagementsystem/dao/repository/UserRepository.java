package com.clinicmanagementsystem.dao.repository;

import com.clinicmanagementsystem.dao.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional <User> getUser(String login);

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);

    List <User> getAll();
}
