package com.ary.cuarso.springboot.error.springbooterror.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ary.cuarso.springboot.error.springbooterror.exceptions.UserNotFoundException;
import com.ary.cuarso.springboot.error.springbooterror.models.domains.User;
import com.ary.cuarso.springboot.error.springbooterror.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private UserService service;

    @GetMapping("/app")
    public String index() {
        // int value=100/0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User showByid(@PathVariable(name="id")Long id){

        User user =service.findById(id).orElseThrow(()->new UserNotFoundException("Error el usuario no existe "));
        // if(user==null){
        //     throw new UserNotFoundException("Error el usuario no existe ");
        // }
        // Optional<User> optionalUser=service.findById(id);
        // if(optionalUser.isEmpty()){
        //     return ResponseEntity.notFound().build();
        // }
        //System.out.println(user.getLastname());
        return user;
        
    }
}
