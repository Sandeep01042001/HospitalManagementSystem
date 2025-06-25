package com.AccioJob.HMS.model;


import lombok.*;

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

}
