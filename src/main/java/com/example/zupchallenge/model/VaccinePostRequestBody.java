package com.example.zupchallenge.model;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class VaccinePostRequestBody {


    @NotBlank
    private String vaccineName;

    @NotBlank
    private String userEmail;

    @NotNull
    private LocalDate date;

    @NotNull
    private Long userId;




}
