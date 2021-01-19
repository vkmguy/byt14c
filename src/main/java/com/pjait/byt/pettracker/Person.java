package com.pjait.byt.pettracker;


import java.util.List;
import java.util.regex.Pattern;

public abstract class Person {
    private String name;
    private String surname;
    private String email;
    private List<Pet> petList;
    public Person(String name,String surname,String email){
        if(Pattern.matches("[A-Z][a-z]+", name)){
            this.name = name;
        } else
            this.name = "undefined";

        if(Pattern.matches("[A-Z][a-z]+", surname)){
            this.surname = surname;
        } else
            this.surname = "undefined";

        if(Pattern.matches("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", email)){
            this.email = email;
        } else
            this.email = "undefined";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(Pattern.matches("[A-Z][a-z]+", name)){
            this.name = name;
        } else
            this.name = "undefined";
    }
    public List<Pet> getPetList(){
        return petList;
    }
    public void setPetList(List<Pet> petList){
        this.petList = petList;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(Pattern.matches("[A-Z][a-z]+", surname)){
            this.surname = surname;
        } else
            this.surname = "undefined";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(Pattern.matches("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", email)){
            this.email = email;
        } else
            this.email = "undefined";
    }
}
