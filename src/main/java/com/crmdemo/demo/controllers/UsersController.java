package com.crmdemo.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @RequestMapping(value = "prueba")
    public String prueba(){
        return "Prueba";
    }
}
