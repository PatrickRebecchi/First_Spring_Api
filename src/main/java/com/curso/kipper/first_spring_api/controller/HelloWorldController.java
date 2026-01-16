package com.curso.kipper.first_spring_api.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String homeHello(){
        return "Teste 01";

    }

    @GetMapping("/usuario")
    public String homeUsuario() {
        return "Teste 02";
    }
}
