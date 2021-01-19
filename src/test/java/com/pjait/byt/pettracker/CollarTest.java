package com.pjait.byt.pettracker;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CollarTest {
    Collar collar = new Collar(4, "Blue");

    @Test
    void constructor(){
        Collar c = new Collar(4, "Red");
        assertEquals(4, c.getSize());
        assertEquals("Red", c.getCollarColour());

        Collar c1 = new Collar(5, "Red");
        assertEquals(-1, c1.getSize());
        assertEquals("Error", c1.getCollarColour());

        Collar c2 = new Collar(3, "Yellow");
        assertEquals(-1, c2.getSize());
        assertEquals("Error", c2.getCollarColour());
    }


    @Test
    void getSize() {
        assertEquals(4, collar.getSize());
    }

    @Test
    void getCollarColour() {
        assertEquals("Blue", collar.getCollarColour());
    }

    @Test
    void registerCurrentLocation() {
        collar.registerCurrentLocation();
        assertEquals(1, collar.getLocationLog().size());
    }

    @Test
    void registerCurrentPulse() {
        collar.registerCurrentPulse();
        assertEquals(1, collar.getPulseLog().size());
    }

    @Test
    void getLocation() {
        collar.registerCurrentLocation();
        Location l = collar.getLocation(new Date(121,1,17, 20,13));
        assertTrue(l.getLat() == 51.0 && l.getLon() == 22.0);
    }

    @Test
    void getPulse() {
        collar.registerCurrentPulse();
        assertEquals(23, collar.getPulse(new Date(121,1,17, 20,13)).getBpm());
    }
}