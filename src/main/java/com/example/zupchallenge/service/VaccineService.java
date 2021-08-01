package com.example.zupchallenge.service;


import com.example.zupchallenge.model.Vaccine;
import com.example.zupchallenge.model.VaccinePostRequestBody;
import com.example.zupchallenge.repository.UserRepository;
import com.example.zupchallenge.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class VaccineService {

    @Autowired
    VaccineRepository vaccineRepository;

    @Autowired
    UserRepository userRepository;

    public Vaccine save(VaccinePostRequestBody vaccinePostRequestBody) {

        Vaccine vaccine = Vaccine.builder()
                .name(vaccinePostRequestBody.getVaccineName())
                .userEmail(vaccinePostRequestBody.getUserEmail())
                .users(userRepository.findById(vaccinePostRequestBody.getUserId())
                        .orElseThrow(() -> new NullPointerException("Not found")))
                .date(String.valueOf(vaccinePostRequestBody.getDate()))
                .build();


        return vaccineRepository.save(vaccine);

    }

    public List<Vaccine> findAll() {

        return vaccineRepository.findAll();


    }
}
