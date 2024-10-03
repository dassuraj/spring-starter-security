package com.security.webtech.springsecurity.controller;

import com.security.webtech.springsecurity.entity.User;
import com.security.webtech.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/find-all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/save")
    public User save(User user) {
        return userService.save(user);
    }

    @PutMapping("/update/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

}
