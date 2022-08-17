package com.NestDigital.userapp.controller;

import com.NestDigital.userapp.model.UserAppModel;
import com.NestDigital.userapp.model.dao.UserAppDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAppController {
    @Autowired
    UserAppDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/register")
    public  String adduser(@RequestBody UserAppModel users){
        dao.save(users);
        return "users added successfully";
    }
}
