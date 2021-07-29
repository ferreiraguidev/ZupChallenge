package com.example.zupchallenge.service;


import com.example.zupchallenge.model.User;
import com.example.zupchallenge.model.UserPostRequestBody;
import com.example.zupchallenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User save(UserPostRequestBody userPostRequestBody) {

        User user = User.builder()
                .name(userPostRequestBody.getName())
                .email(userPostRequestBody.getEmail())
                .cpf(userPostRequestBody.getCpf())
                .birth(userPostRequestBody.getBirth())
                .build();

        return userRepository.save(user);
    }

    public List<User> listAll() {
        return userRepository.findAll();

    }


}
