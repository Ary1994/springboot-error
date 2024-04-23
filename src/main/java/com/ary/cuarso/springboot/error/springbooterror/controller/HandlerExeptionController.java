package com.ary.cuarso.springboot.error.springbooterror.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ary.cuarso.springboot.error.springbooterror.models.ErrorByAry;

@RestControllerAdvice
public class HandlerExeptionController {
    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity <?> divisionByZero(Exception ex){
        return ResponseEntity.internalServerError().body("Error 500");
    }

}
