package com.AccioJob.HMS.service;

import com.AccioJob.HMS.model.Doctor;
import com.AccioJob.HMS.model.Hospital;
import com.AccioJob.HMS.repository.DoctorRepository;
import com.AccioJob.HMS.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    HospitalRepository hospitalRepository;

    public void registerDoctor(Doctor doctor){
        int id = doctorRepository.totalDoctors()+1;
        doctor.setId(id);
        doctor.getAssignHospitals().add(assignHospital(doctor));
        doctorRepository.registerDoctor(id, doctor);


    }

    public Doctor getDoctorDetails(int id){

        return doctorRepository.getDoctorDetails(id);
    }

    public Hospital assignHospital(Doctor doctor){
        HashMap<Integer, Hospital> hospitals = hospitalRepository.getHospitalDB();
        for(Hospital hospital : hospitals.values()){
            Set<String> hospitalDiseases = hospital.getDiseases();
            if(!hospitalDiseases.contains(doctor.getSpecialties())){
                hospitalDiseases.add(doctor.getSpecialties());
                return hospital;
            }
        }
        return null;
    }
}
