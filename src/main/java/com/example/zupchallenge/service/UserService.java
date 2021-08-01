package com.example.zupchallenge.service;


import com.example.zupchallenge.model.Users;
import com.example.zupchallenge.model.UserPostRequestBody;
import com.example.zupchallenge.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users save(UserPostRequestBody userPostRequestBody) {

        Users users = Users.builder()
                .name(userPostRequestBody.getName())
                .email(userPostRequestBody.getEmail())
                .cpf(userPostRequestBody.getCpf())
                .birth(userPostRequestBody.getBirth())
                .build();

        return userRepository.save(users);
    }

    public List<Users> listAllUser() {
        return userRepository.findAll();
    }


}
