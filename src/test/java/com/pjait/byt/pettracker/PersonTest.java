package com.pjait.byt.pettracker;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    Person testPerson = new User("John","Smith","johnsmith@gmail.com", "temp");
    Person testPerson2 = new User("Joe","doe","joedoegmail.com", "temp");
    Person testPerson3 = new User("123Joe","Doe","joedoe@gmail.com", "temp");
    Person testPerson4 = new User("joe","123Doe","joedoe@gmailcom", "temp");
    @Test
    public void getPerson() {
        Person person = new User("A", "WW", "AS", "aaa");
    }

    @Test
    public void personTest() {
        Assert.assertNotNull(testPerson);
        Assert.assertEquals("John",testPerson.getName());
        Assert.assertEquals("Smith",testPerson.getSurname());
        Assert.assertEquals("johnsmith@gmail.com",testPerson.getEmail());

        Assert.assertNotNull(testPerson2);
        Assert.assertEquals("Joe",testPerson2.getName());
        Assert.assertEquals("undefined",testPerson2.getSurname());
        Assert.assertEquals("undefined",testPerson2.getEmail());

        Assert.assertNotNull(testPerson3);
        Assert.assertEquals("undefined",testPerson3.getName());
        Assert.assertEquals("Doe",testPerson3.getSurname());
        Assert.assertEquals("joedoe@gmail.com",testPerson3.getEmail());

        Assert.assertNotNull(testPerson4);
        Assert.assertEquals("undefined",testPerson4.getName());
        Assert.assertEquals("undefined",testPerson4.getSurname());
        Assert.assertEquals("undefined",testPerson4.getEmail());


    }
    @Test
    public void getsetNameTest() {
        testPerson.setName("Mary");
        Assert.assertEquals("Mary",testPerson.getName());
        testPerson.setName("mary2");
        Assert.assertEquals("undefined",testPerson.getName());
    }
    @Test
    public void getsetsSurNameTest() {
        testPerson.setSurname("Sue");
        Assert.assertEquals("Sue",testPerson.getSurname());
        testPerson.setSurname("sue123");
        Assert.assertEquals("undefined",testPerson.getSurname());
    }
    @Test
    public void getsetEmailTest() {
        testPerson.setEmail("marysue@gmail.com");
        Assert.assertEquals("marysue@gmail.com",testPerson.getEmail());
        testPerson.setEmail("incorrectMail");
        Assert.assertEquals("undefined",testPerson.getEmail());
    }

}
