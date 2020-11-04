package com.example.javaSpring.controller;

import com.example.javaSpring.dto.UserDto;
import com.example.javaSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {


    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    //UserDto userDto:- spring will automatically convert to UserDto class
    public void saveUser(@RequestBody UserDto userDto){

        userService.saveUser(userDto);

    }
}
