package com.ary.cuarso.springboot.error.springbooterror.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.ary.cuarso.springboot.error.springbooterror.models.ErrorByAry;

@RestControllerAdvice
public class HandlerExeptionController {
    @ExceptionHandler({ ArithmeticException.class })
    public ResponseEntity<ErrorByAry> divisionByZero(Exception ex) {

        ErrorByAry error = new ErrorByAry();
        error.setDate(new Date());
        error.setError("Error al dividir por cero ");
        error.setMenssage(ex.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        // return ResponseEntity.internalServerError().body(error);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }

    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public  Map <String,Object> numberFormatException(Exception ex){
        
        Map <String,Object> errorMap=new HashMap<>();
        errorMap.put("date",new Date());
        errorMap.put("error", "Numero invalido o incorrecto, no tiene formato de digito");
        errorMap.put("message", ex.getMessage());
        errorMap.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());

        
        return errorMap;


    }



    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ErrorByAry> notFountEx(NoHandlerFoundException ex) {
        ErrorByAry error = new ErrorByAry();
        error.setDate(new Date());
        error.setError("Api rest no encontrado ");
        error.setMenssage(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);

    }

}
