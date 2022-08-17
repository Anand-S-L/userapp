package com.NestDigital.userapp.model.dao;

import com.NestDigital.userapp.model.UserAppModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface UserAppDao extends CrudRepository<UserAppModel,Integer> {
@Query(value = "SELECT `id`, `email`, `name`, `password`, `phoneno`, `username` FROM `users` WHERE username=?1 AND password=?2",nativeQuery = true)
    List<UserAppModel> login(String username,String password);

@Transactional
@Modifying
@Query(value = "UPDATE `users` SET `email`=?1,`name`=?2,`password`=?3,`phoneno`=?4,`username`=?5 WHERE id=?6",nativeQuery = true)
   void  update(String email,String name,String password,String phoneno,String username,String id);
}
