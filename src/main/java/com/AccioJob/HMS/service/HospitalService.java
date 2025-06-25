package com.AccioJob.HMS.service;


import com.AccioJob.HMS.model.Hospital;
import com.AccioJob.HMS.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class HospitalService {

    @Autowired
    HospitalRepository hospitalRepository;

    public void registerHospital(Hospital hospital){
        int id = hospitalRepository.totalHospital()+1;
        hospital.setId(id);
        hospitalRepository.registerHospital(id, hospital);
    }

    public Hospital getHospitalDetails(int id){
        return hospitalRepository.getHospitalDetails(id);
    }

    public List<Hospital> getAllHospital(){
        List<Hospital> list = new ArrayList<>();
        HashMap<Integer, Hospital> map = hospitalRepository.getHospitalDB();
        for(int key : map.keySet()){
            Hospital hospital = map.get(key);
            list.add(hospital);
        }
        return list;
    }
}
