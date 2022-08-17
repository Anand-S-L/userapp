package com.NestDigital.userapp.model.dao;

import com.NestDigital.userapp.model.UserAppModel;
import org.springframework.data.repository.CrudRepository;

public interface UserAppDao extends CrudRepository<UserAppModel,Integer> {
}
