package com.pjait.byt.pettracker;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void userTest() {
        User testUser = new User("John","Smith","johnsmith@gmail.com","Standard");
        Assert.assertNotNull(testUser);
        Assert.assertEquals("John",testUser.getName());
        Assert.assertEquals("Smith",testUser.getSurname());
        Assert.assertEquals("johnsmith@gmail.com",testUser.getEmail());
        Assert.assertEquals("Standard",testUser.getAppType());
        testUser.setAppType("Premium");
        Assert.assertEquals("Premium",testUser.getAppType());
        testUser.setAppType("sth");
        Assert.assertEquals("undefined",testUser.getAppType());
    }
}
