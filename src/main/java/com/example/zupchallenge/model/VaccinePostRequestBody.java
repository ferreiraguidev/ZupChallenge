package com.example.zupchallenge.model;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
public class VaccinePostRequestBody {

    private long id;

    @NotBlank
    private String vaccineName;

    @NotBlank
    private String userEmail;

    @NotBlank
    private LocalDate date;


}
