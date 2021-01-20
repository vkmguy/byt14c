package com.pjait.byt.pettracker;

import java.util.ArrayList;

public class User extends Person{
    private String appType;
    private ArrayList<Pet> listOfPets;

    public User(String name,String surname,String email,String appType){
        super(name,surname,email);
        if(appType.equals("Standard")||appType.equals("Premium")){
            this.appType = appType;
        } else
            this.appType = "undefined";

    }
    public ArrayList<Pet> getListOfPets() {
        return listOfPets;
    }

    public void setListOfPets(ArrayList<Pet> listOfPets) {
        this.listOfPets = listOfPets;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        if(appType.equals("Standard")||appType.equals("Premium")){
            this.appType = appType;
        } else
        this.appType = "undefined";
    }


    public Collar registerCollar(){
        return new Collar(3, "Yellow");//if successful it returns a collar created, if fails returns null
    }
    public Collar assignCollar(){
        return new Collar(3, "Yellow"); //if successful it returns a collar assigned, if fails returns null
    }

}
