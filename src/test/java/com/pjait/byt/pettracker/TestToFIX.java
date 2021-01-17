package com.pjait.byt.pettracker;

import org.junit.Assert;
import org.junit.Test;

public class TestToFIX {
    @Test
    public void getPerson() {
        Person person = new User("A", "WW", "AS", "aaa");
    }
    @Test
    public void PersonTest() {
        Person testPerson = new User("John","Smith","johnsmith@gmail.com", "temp");
        Assert.assertNotNull(testPerson);

        Assert.assertEquals("John",testPerson.getName());
        Assert.assertEquals("Smith",testPerson.getSurname());
        Assert.assertEquals("johnsmith@gmail.com",testPerson.getEmail());

        testPerson.setName("Mary");
        Assert.assertEquals("Mary",testPerson.getName());
        testPerson.setSurname("Sue");
        Assert.assertEquals("Sue",testPerson.getSurname());
        testPerson.setEmail("marysue@gmail.com");
        Assert.assertEquals("marysue@gmail.com",testPerson.getEmail());
    }

    @Test
    public void UserTest() {
        User testUser = new User("John","Smith","johnsmith@gmail.com","Standard");
        Assert.assertNotNull(testUser);
        Assert.assertEquals("John",testUser.getName());
        Assert.assertEquals("Smith",testUser.getSurname());
        Assert.assertEquals("johnsmith@gmail.com",testUser.getEmail());
        Assert.assertEquals("Standard",testUser.getAppType());
        testUser.setAppType("Premium");
        Assert.assertEquals("Premium",testUser.getAppType());
    }
}
