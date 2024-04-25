package com.ary.cuarso.springboot.error.springbooterror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.ary.cuarso.springboot.error.springbooterror.models.domains.User;

@Configuration
public class AppConfig {
   
    @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Pepe", "garcia"));
        users.add(new User(2L, "Pepe2", "garcia"));
        users.add(new User(3L, "Pepe3", "garcia"));
        users.add(new User(4L, "Pepe4", "garcia"));
        users.add(new User(5L, "Pepe5", "garcia"));
        return users;
    }
}
