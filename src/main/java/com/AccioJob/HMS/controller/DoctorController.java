package com.AccioJob.HMS.controller;

import com.AccioJob.HMS.model.Doctor;
import com.AccioJob.HMS.service.DoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/doctor")
@Slf4j
public class DoctorController {

    @Autowired
    DoctorService doctorService;


    @PostMapping("/register")
    public void registerDoctor(@RequestBody Doctor doctor){
        doctorService.registerDoctor(doctor);
    }


}
