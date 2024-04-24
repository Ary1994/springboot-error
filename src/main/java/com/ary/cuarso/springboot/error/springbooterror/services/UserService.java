package com.ary.cuarso.springboot.error.springbooterror.services;

import java.util.List;

import com.ary.cuarso.springboot.error.springbooterror.models.domains.User;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
    
}
