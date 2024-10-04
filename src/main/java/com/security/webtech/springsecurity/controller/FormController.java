package com.security.webtech.springsecurity.controller;

import com.security.webtech.springsecurity.entity.FormData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    //handler method for handling for form
    //localhost:8080/register
    @GetMapping("/register")
    public String form(Model model) {

        FormData userForm=new FormData();
        model.addAttribute("userForm",userForm);
        List<String> listProfession =Arrays.asList("Developer","Tester","Architect");
        model.addAttribute("listOfProfession",listProfession);
        return "register-form";
    }

    ////handler method for handling registration form submission request
    @PostMapping("/register/save")
    public String submitForm(Model model , @ModelAttribute("userForm")FormData userForm){
        model.addAttribute("userForm",userForm);
        return "register-success";
    }
}
