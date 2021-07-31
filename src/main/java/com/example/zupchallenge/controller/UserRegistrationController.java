package com.example.zupchallenge.controller;


import com.example.zupchallenge.model.User;
import com.example.zupchallenge.model.UserPostRequestBody;
import com.example.zupchallenge.service.UserService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Data
public class UserRegistrationController {

    private final UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<User>> listAll() {
        return new ResponseEntity<>(userService.listAll(), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<User> save(UserPostRequestBody userPostRequestBody) {
        return new ResponseEntity<>(userService.save(userPostRequestBody), HttpStatus.CREATED);

    }
}
