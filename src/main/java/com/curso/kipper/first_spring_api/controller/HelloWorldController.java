package com.curso.kipper.first_spring_api.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String homeHello(){
        return "Teste 001";
    }

    @GetMapping("/usuario")
    public String homeUsuario() {
        return "Teste 02";
    }

    @GetMapping("/usuario{name}")
    public String usuarioName(@PathVariable String name){
        return String.format("Usuario %s. ", name);
    }

}
