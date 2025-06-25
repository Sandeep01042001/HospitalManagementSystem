package com.AccioJob.HMS.model;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pacent {
    int id;
    int name;
    String disease;
    long phoneNumber;
}
