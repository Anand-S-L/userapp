package com.NestDigital.userapp.controller;

import com.NestDigital.userapp.model.UserAppModel;
import com.NestDigital.userapp.model.dao.UserAppDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public Boolean login(@RequestBody UserAppModel user){
        String username=user.getUsername();
        String password=user.getPassword();
        if( dao.login(username,password).size()==0){
            return false;
        }
        else{
            return true;
        }

    }
}
