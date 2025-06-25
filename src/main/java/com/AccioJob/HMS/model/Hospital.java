package com.AccioJob.HMS.model;

import lombok.*;

import java.util.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hospital {
    int id;
    String name;
    String email;
    String webSite;
    long phoneNumber;
    List<Doctor> doctors;
    List<Pacent> pacents;
}
