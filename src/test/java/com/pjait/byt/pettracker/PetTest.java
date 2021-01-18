package com.pjait.byt.pettracker;
import org.junit.Before;
import org.junit.Test;
import java.sql.Time;

import static org.junit.Assert.*;


public class PetTest {
    Pet pet;
    Collar collar;

    @Before
    public void init() {
        collar = new Collar(3, "red");
        pet = new Pet("dog", "chihuahua");
        pet.setCollar(collar);
        pet.setFeedingTime(1,1,1);
        pet.setLowerLimit(new Pulse(1,1,1));
        pet.setUpperLimit(new Pulse(2,2,2));
        Location[] location = new Location[2];
        location[0] = new Location(1,1);
        location[1] = new Location(-30,2);
        pet.setPredefinedZone(location);
    }

    @Test
    public void testGetter(){
        assertEquals(pet.getCollar(), collar);
        assertEquals(pet.getBreed(), "chihuahua");
        assertEquals(pet.getSpecies(), "dog");
        assertEquals(pet.getFeedingTime().toString(), new Time(1,1,1).toString());
    }

    @Test
    public void testIsPetOutsidePredefinedZone(){
        assertTrue(pet.isPetOutsidePredefinedZone());
    }

    @Test
    public void isPetPulseInNormalRange(){
        assertFalse(pet.isPetPulseInNormalRange());
    }

    @Test
    public void testShowPetStatistics(){
        assertEquals(pet.showPetStatistics(), "dog, chihuahua, loc: 51.0, 22.0, bpm: 23.0");
    }

}

