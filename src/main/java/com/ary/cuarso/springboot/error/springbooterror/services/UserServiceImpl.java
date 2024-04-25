package com.ary.cuarso.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ary.cuarso.springboot.error.springbooterror.models.domains.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Pepe", "garcia"));
        users.add(new User(2L, "Pepe2", "garcia"));
        users.add(new User(3L, "Pepe3", "garcia"));
        users.add(new User(4L, "Pepe4", "garcia"));
        users.add(new User(5L, "Pepe5", "garcia"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {

        return Optional.ofNullable(users.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null));

    }

}
