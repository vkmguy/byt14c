package com.pjait.byt.pettracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class UserTest {
    private User testUser = new User("John","Smith","johnsmith@gmail.com","Standard");
    private User testUser2 = new User("Joe","Doe","joedoe@gmail.com","Sth");

    @Test
    public void userConstructorTest() {

        Assert.assertNotNull(testUser);
        Assert.assertEquals("John",testUser.getName());
        Assert.assertEquals("Smith",testUser.getSurname());
        Assert.assertEquals("johnsmith@gmail.com",testUser.getEmail());
        Assert.assertEquals("Standard",testUser.getAppType());

        Assert.assertNotNull(testUser2);
        Assert.assertEquals("Joe",testUser2.getName());
        Assert.assertEquals("Doe",testUser2.getSurname());
        Assert.assertEquals("joedoe@gmail.com",testUser2.getEmail());
        Assert.assertEquals("undefined",testUser2.getAppType());
    }

    @Test
    public void getAppTypeTest(){
        Assert.assertEquals("Standard",testUser.getAppType());
        testUser.setAppType("Premium");
        Assert.assertEquals("Premium",testUser.getAppType());
        testUser.setAppType("sth");
        Assert.assertEquals("undefined",testUser.getAppType());
    }

    @Test
    public void listOfPetsGetSetTest() {
        ArrayList<Pet> listOfPets = new ArrayList<Pet>();
        listOfPets.add(new Pet("dog", "chihuahua"));
        listOfPets.add(new Pet("dog", "pomeranian"));
        testUser.setListOfPets(listOfPets);
        Assert.assertEquals("chihuahua",testUser.getListOfPets().get(0).getBreed());
        Assert.assertEquals("pomeranian",testUser.getListOfPets().get(1).getBreed());
    }
}
