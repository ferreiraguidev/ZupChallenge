package com.example.zupchallenge.model;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
public class UserPostRequestBody {

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    private LocalDate birth;

    @NotBlank
    private String email;

}
