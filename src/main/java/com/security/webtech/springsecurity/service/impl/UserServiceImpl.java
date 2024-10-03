package com.security.webtech.springsecurity.service.impl;

import com.security.webtech.springsecurity.entity.User;
import com.security.webtech.springsecurity.repository.UserRepository;
import com.security.webtech.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(Long id, User user) {
        User user1 = new User();
        boolean isExist = userRepository.existsById(id);
        if (isExist) {
            user1.setName(user.getName());
            user1.setPassword(user.getPassword());
        }
        return userRepository.save(user1);
    }
}
