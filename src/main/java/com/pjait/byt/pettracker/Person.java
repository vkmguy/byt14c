package com.pjait.byt.pettracker;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
public class Person {
    private String name;
    private Date dob;
    private Location location;

    //
    public Location getPersonHistory(Timestamp time){
        return null;
    }
}
