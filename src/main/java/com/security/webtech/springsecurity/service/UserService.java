package com.security.webtech.springsecurity.service;

import com.security.webtech.springsecurity.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> findAll();
    public User save(User user);
    public User update(Long id, User user);
}
