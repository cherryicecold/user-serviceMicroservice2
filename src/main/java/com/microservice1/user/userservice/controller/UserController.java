package com.microservice1.user.userservice.controller;

import com.microservice1.user.userservice.VO.ResponseTemplateVO;
import com.microservice1.user.userservice.entity.User;
import com.microservice1.user.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }
    @GetMapping("{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside the getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);

    }
}
