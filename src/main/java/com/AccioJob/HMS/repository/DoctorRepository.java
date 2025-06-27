package com.AccioJob.HMS.repository;

import com.AccioJob.HMS.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DoctorRepository {

    HashMap<Integer, Doctor> doctorDB;

    public DoctorRepository(){
        this.doctorDB = new HashMap<>();
    }

    public int totalDoctors(){
        return this.doctorDB.size();
    }
    public void registerDoctor(int id, Doctor doctor){
        this.doctorDB.put(id, doctor);
    }

    public Doctor getDoctorDetails(int id){
        return this.doctorDB.get(id);
    }

}
