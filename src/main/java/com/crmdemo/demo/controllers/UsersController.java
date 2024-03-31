package com.crmdemo.demo.controllers;

import com.crmdemo.demo.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @RequestMapping(value = "users")
    public List<User> index(){
        User user = new User();
        user.setFirstName("Carlos");
        user.setLastName("Acosta");
        user.setEmail("carlostest@gmail.com");
        user.setPhone("123456");

        return List.of(user);
    }
    @RequestMapping(value = "user/{id}")
    public User show(@PathVariable Long id){
        User user = new User();
        user.setId(id);
        user.setFirstName("Carlos");
        user.setLastName("Acosta");
        user.setEmail("carlostest@gmail.com");
        user.setPhone("123456");

        return user;
    }

    @RequestMapping(value = "user/edit")
    public User edit(){
        User user = new User();
        user.setFirstName("Carlos");
        user.setLastName("Acosta");
        user.setEmail("carlostest@gmail.com");
        user.setPhone("123456");

        return user;
    }

    @RequestMapping(value = "user/delete")
    public User delete(){
        User user = new User();
        user.setFirstName("Carlos");
        user.setLastName("Acosta");
        user.setEmail("carlostest@gmail.com");
        user.setPhone("123456");

        return user;
    }
}
