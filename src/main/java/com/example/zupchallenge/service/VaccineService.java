package com.example.zupchallenge.service;


import com.example.zupchallenge.model.User;
import com.example.zupchallenge.model.Vaccine;
import com.example.zupchallenge.model.VaccinePostRequestBody;
import com.example.zupchallenge.repository.VaccineRepository;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService {

    @Autowired
    VaccineRepository vaccineRepository;

    public Vaccine save(VaccinePostRequestBody vaccinePostRequestBody) {

        Vaccine vaccine = Vaccine.builder()
                .name(vaccinePostRequestBody.getVaccineName())
                .userEmail(vaccinePostRequestBody.getUserEmail())
                .date(vaccinePostRequestBody.getDate())
                .build();


        return vaccineRepository.save(vaccine);

    }

    public List<Vaccine> findAll() {

        return vaccineRepository.findAll();


    }
}
