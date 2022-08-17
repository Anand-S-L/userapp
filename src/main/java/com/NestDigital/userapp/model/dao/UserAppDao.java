package com.NestDigital.userapp.model.dao;

import com.NestDigital.userapp.model.UserAppModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserAppDao extends CrudRepository<UserAppModel,Integer> {
@Query(value = "SELECT `id`, `email`, `name`, `password`, `phoneno`, `username` FROM `users` WHERE username=?1 AND password=?2",nativeQuery = true)
    List<UserAppModel> login(String username,String password);
}
