package com.pjait.byt.pettracker;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void getPerson() {
        Person person = new User("A", "WW", "AS", "aaa");
    }
    @Test
    public void personTest() {
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

        testPerson.setName("mary2");
        Assert.assertEquals("undefined",testPerson.getName());
        testPerson.setSurname("sue123");
        Assert.assertEquals("undefined",testPerson.getSurname());
        testPerson.setEmail("incorrectMail");
        Assert.assertEquals("undefined",testPerson.getEmail());
    }
}
