package com.pjait.byt.pettracker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PulseTest {
    Pulse pulse;
    Pulse pulse2;

    @Before
    public void init() {
        pulse = new Pulse(2,1,1);
        pulse2 = new Pulse(-3,2,1);
        Assert.assertNotNull(pulse);
    }

    @Test
    public void testGetter(){
        pulse.setBpm(-1);
        assertEquals(pulse2.getBpm(), pulse.getBpm(), 0);
        pulse.setVolume(2);
        assertEquals(pulse2.getForce(), pulse.getForce(), 0);
        pulse.setVolume(9);
        assertNotEquals(pulse2.getVolume(), pulse.getVolume(), 0);
    }
}


