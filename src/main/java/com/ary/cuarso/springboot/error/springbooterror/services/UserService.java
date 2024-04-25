package com.ary.cuarso.springboot.error.springbooterror.services;

import java.util.List;
import java.util.Optional;

import com.ary.cuarso.springboot.error.springbooterror.models.domains.User;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);
    
}
