package com.security.webtech.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormData {

    private String name;
    private String email;
    private String password;
    private String address;
    private String gender;
    private String married;
    private String profession;

}
