package com.example.zupchallenge.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VaccinePostRequestBody {

    private long id;

    @NotNull
    private String vaccineName;

    @NotNull
    private String userEmail;

    @NotNull
    private LocalDate date;


}
