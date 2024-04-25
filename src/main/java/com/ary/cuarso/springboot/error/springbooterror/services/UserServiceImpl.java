package com.ary.cuarso.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ary.cuarso.springboot.error.springbooterror.models.domains.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private List<User> users;


    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {

        return users.stream().filter(p -> p.getId().equals(id)).findFirst();

    }

}
