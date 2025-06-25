package com.AccioJob.HMS.service;

import com.AccioJob.HMS.model.Doctor;
import com.AccioJob.HMS.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public void registerDoctor(Doctor doctor){
        int id = doctorRepository.totalDoctors()+1;
        doctor.setId(id);
        doctorRepository.registerDoctor(id, doctor);
    }
}
