package com.AccioJob.HMS.controller;


import com.AccioJob.HMS.model.Hospital;
import com.AccioJob.HMS.service.HospitalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hospital")
@Slf4j
public class HospitalController {

    @Autowired
    HospitalService hospitalService;


    /**
     * This function will get triggered when endpoint http://localhost:8080/api/v1/hospital/register
     * will get triggered
     * This functuion will be internally calling hospitalService registerHospital method and in which
     * we will be passing the hospital object which have recieved from the client that can be frontend or postman
     * @param hospital
     */

    @PostMapping("/register")
    public void registerHospital(@RequestBody Hospital hospital){
        log.info("Got hospital model object from the client : " + hospital);
        log.info("Calling Hospital Service");
        hospitalService.registerHospital(hospital);
    }

    @GetMapping("/get/{id}")
    public Hospital getHospitalDetails(@PathVariable int id){
        return hospitalService.getHospitalDetails(id);
    }

    @GetMapping("/get/all")
    public List<Hospital> getAllHospital(){
        return hospitalService.getAllHospital();
    }


}
