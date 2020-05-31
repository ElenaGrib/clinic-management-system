package com.clinicmanagementsystem.service.api;

import com.clinicmanagementsystem.dao.entity.User;

import java.util.List;

public interface UserService {
    boolean create(User user);

    User update(User user);

    void delete(Long id);

    List <User> getAll();
}
