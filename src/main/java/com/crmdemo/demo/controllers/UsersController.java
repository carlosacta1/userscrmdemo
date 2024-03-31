package com.crmdemo.demo.controllers;

import com.crmdemo.demo.dao.UserDao;
import com.crmdemo.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UserDao userDao;

    @GetMapping(value = "users")
    public String getUsers(Model model) {
        List<User> users = userDao.getUsers();
        model.addAttribute("users", users);
        System.out.println("Este es un mensaje de logging.");
        System.out.println(users);
        return "users/index";
    }

    @RequestMapping(value = "user/{id}")
    public User show(@PathVariable Long id){
        User user = new User();
//        user.setId(id);
//        user.setFirstName("Carlos");
//        user.setLastName("Acosta");
//        user.setEmail("carlostest@gmail.com");
//        user.setPhone("123456");

        return user;
    }

    @RequestMapping(value = "user/edit")
    public User edit(){
        User user = new User();
//        user.setFirstName("Carlos");
//        user.setLastName("Acosta");
//        user.setEmail("carlostest@gmail.com");
//        user.setPhone("123456");

        return user;
    }

    @RequestMapping(value = "user/delete")
    public User delete(){
        User user = new User();
//        user.setFirstName("Carlos");
//        user.setLastName("Acosta");
//        user.setEmail("carlostest@gmail.com");
//        user.setPhone("123456");

        return user;
    }
}
