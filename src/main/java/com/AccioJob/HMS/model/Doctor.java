package com.AccioJob.HMS.model;


import lombok.*;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Doctor {
    int id;
    String name;
    String email;
    String degree;
    String specialties;
    long phoneNumber;
    List<Hospital> assignHospitals;
    List<Pacent> assignPacents;

}
