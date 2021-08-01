package com.example.zupchallenge.controller;


import com.example.zupchallenge.model.Users;
import com.example.zupchallenge.model.UserPostRequestBody;
import com.example.zupchallenge.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserRegistrationController {

    private final UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public List<Users> listAll() {
        return userService.listAllUser();
    }

    @PostMapping("/user")
    public ResponseEntity<Users> save(@RequestBody UserPostRequestBody userPostRequestBody) {
        return new ResponseEntity<>(userService.save(userPostRequestBody), HttpStatus.CREATED);
    }
}
