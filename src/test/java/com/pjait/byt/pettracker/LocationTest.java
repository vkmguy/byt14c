package com.pjait.byt.pettracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    Location l = new Location(52.876467, 23.564732);

    @Test
    void getLat() {
        assertEquals(52.876467, l.getLat());
    }

    @Test
    void getLon() {
        assertEquals(23.564732, l.getLon());
    }
}