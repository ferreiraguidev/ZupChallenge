package com.example.zupchallenge.controller;

import com.example.zupchallenge.model.Vaccine;
import com.example.zupchallenge.model.VaccinePostRequestBody;
import com.example.zupchallenge.service.VaccineService;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@Data
@RequestMapping("api/v1")
public class VaccineRegistrationController {

    private final VaccineService vaccineService;

    @GetMapping("/vaccine")
    public ResponseEntity<List<Vaccine>> listAll() {
        return new ResponseEntity<>(vaccineService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/vaccine")
    public ResponseEntity<Vaccine> save(@RequestBody VaccinePostRequestBody vaccinePostRequestBody) {
        return new ResponseEntity<>(vaccineService.save(vaccinePostRequestBody), HttpStatus.CREATED);
    }

}
