package com.example.zupchallenge.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPostRequestBody {


    private long id;

    @NotNull
    private String name;

    @NotNull
    private long cpf;

    @NotNull
    private long birth;

    @NotNull
    private String email;

}
