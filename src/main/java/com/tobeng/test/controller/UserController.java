package com.tobeng.test.controller;

import com.tobeng.test.entity.User;
import com.tobeng.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void save(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

}
