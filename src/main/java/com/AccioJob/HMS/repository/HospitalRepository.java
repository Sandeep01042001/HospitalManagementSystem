package com.AccioJob.HMS.repository;

import com.AccioJob.HMS.model.Hospital;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

@Repository
public class HospitalRepository {
    HashMap<Integer, Hospital> hospitalDB;

    public HospitalRepository(){
        this.hospitalDB = new HashMap<>();
    }
    public int totalHospital(){
        return this.hospitalDB.size();
    }
    public void registerHospital(int id, Hospital hospital){
        this.hospitalDB.put(id, hospital);
    }
    public Hospital getHospitalDetails(int id){
        return this.hospitalDB.get(id);
    }

    public HashMap<Integer, Hospital> getHospitalDB(){
        return this.hospitalDB;
    }
}
