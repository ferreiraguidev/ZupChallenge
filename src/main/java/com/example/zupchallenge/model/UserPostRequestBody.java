package com.example.zupchallenge.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPostRequestBody {

    private long id;

    @NotBlank
    private String name;
    @NotBlank
    private long cpf;
    @NotBlank
    private long birth;
    @NotBlank
    private String email;

}
