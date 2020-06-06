package com.clinicmanagementsystem.dao.repository;

import com.clinicmanagementsystem.dao.config.DaoConfig;
import com.clinicmanagementsystem.dao.entity.Role;
import com.clinicmanagementsystem.dao.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith (SpringRunner.class)
@ContextConfiguration (classes = {DaoConfig.class})
@Transactional
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Before
    public void setData() {
        Role doctor = createRole("doctor");
        Role patient = createRole("patient");
        createUser("firstLogin", "firstEmail", "password", patient);
        createUser("secondLogin", "secondEmail", "password", patient);
        createUser("thirdLogin", "thirdEmail", "password", doctor);
        createUser("fourthLogin", "fourthEmail", "password", patient);
        createUser("fifthLogin", "fifthEmail", "password", doctor);
    }

    private Role createRole(String value) {
        Role role = new Role();
        role.setValue(value);
        roleRepository.save(role);
        return role;
    }

    private User createUser(String login, String email, String password, Role role) {
        User user = new User();
        user.setLogin(login);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);
        userRepository.save(user);
        return user;
    }

    @Test
    public void findByName() {
        System.out.println("find role");
    }
}
