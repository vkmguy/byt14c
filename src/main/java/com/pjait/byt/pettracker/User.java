package com.pjait.byt.pettracker;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends Person{
    private String appType;
    public User(String name,String surname,String email,String appType){
        super(name,surname,email);
        this.appType=appType;
	}

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public Collar registerCollar(){
        return null;//if successful it returns a collar created, if fails returns null
	}
    public Collar assignCollar(){
        return null; //if successful it returns a collar assigned, if fails returns null
	}

}
