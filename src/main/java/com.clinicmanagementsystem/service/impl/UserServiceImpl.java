package com.clinicmanagementsystem.service.impl;

import com.clinicmanagementsystem.dao.entity.User;
import com.clinicmanagementsystem.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User loadedUser = repository.findUserByLogin(login)
                .orElseThrow(() -> new UsernameNotFoundException("Пользователь с таким логином не найден!"));

        return new org.springframework.security.core.userdetails.User(loadedUser.getLogin(), loadedUser.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(loadedUser.getRole().getValue())));
    }
}