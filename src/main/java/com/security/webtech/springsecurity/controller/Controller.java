package com.security.webtech.springsecurity.controller;

import com.security.webtech.springsecurity.entity.User;
import com.security.webtech.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private UserService userService;
//    @Value("${app.name}")
//    private String appName;
//
//    @Value("${welcome.message}")
//    private String welcomeMessage;

    //handler method for handling variable expressions
    @GetMapping("/login-page")
    public String index(Model model) {
        model.addAttribute("user", new User(1L, "ram", "x1ty"));
        return "login-page";
    }

    //handler method for handling selection expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model) {
        model.addAttribute("users", new User(1L, "mahesh", "hj567"));
        return "selection-expression";
    }

    //handler method for handling message expressions
    //localhost:8080/message-expression
    @GetMapping(value = "/message-expression")
    public String messageExpressions(Model model) {
        return "message-expression";
    }

    //handler method for link-expression
    //localhost:8080/link-expression
    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    //handler method for fragment expressions
    //localhost"8080/fragment-expression
    @GetMapping("/fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

}
