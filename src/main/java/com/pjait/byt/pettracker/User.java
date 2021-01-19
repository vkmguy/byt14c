package com.pjait.byt.pettracker;

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
        if(appType.equals("Standard")||appType.equals("Premium")){
            this.appType = appType;
        }
        this.appType = "incorrect";
    }

    public Collar registerCollar(){
        return null;//if successful it returns a collar created, if fails returns null
    }
    public Collar assignCollar(){
        return null; //if successful it returns a collar assigned, if fails returns null
    }

}
