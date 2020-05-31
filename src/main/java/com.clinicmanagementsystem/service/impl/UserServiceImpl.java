package com.clinicmanagementsystem.service.impl;

import com.clinicmanagementsystem.dao.entity.User;
import com.clinicmanagementsystem.dao.repository.UserRepository;
import com.clinicmanagementsystem.service.api.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Override
    public boolean create(User user) {
        repository.saveUser(user);
        return true;
    }

    @Override
    public User update(User user) {
        return repository.updateUser(user);
    }

    @Override
    public void delete(Long id) {
        repository.deleteUser(id);
    }

    @Override
    public List <User> getAll() {
        return repository.getAll();
    }
}
