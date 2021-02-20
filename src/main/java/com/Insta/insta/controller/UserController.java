package com.Insta.insta.controller;

import com.Insta.insta.entity.User;
import com.Insta.insta.service.UserService;
import com.Insta.insta.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;


    @PostMapping("/api/user")
    public User addUser(@RequestBody User user){
        return  userServiceImpl.addUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userServiceImpl.getAllUser();
    }

    @GetMapping("find/{uid}")
    public User findBook(@PathVariable int uid) {

        return  userServiceImpl.findUser(uid);
    }
    
    

}
