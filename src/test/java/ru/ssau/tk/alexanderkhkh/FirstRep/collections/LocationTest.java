package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LocationTest {

    @Test
    public void testTestEquals() {
        Location location1 = new Location();
        Location location2 = new Location();
        Location location3 = new Location();
        location1.setId(1);
        location2.setId(2);
        location3.setId(1);
        assertTrue(location1.equals(location3));
        assertFalse(location2.equals(location1));
        location3 = location1;
        assertTrue(location1.equals(location3));

    }
}