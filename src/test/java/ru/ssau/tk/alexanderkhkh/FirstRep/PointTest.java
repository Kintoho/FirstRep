package ru.ssau.tk.alexanderkhkh.FirstRep;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testTestToString() {
        assertEquals(new Point(1,2,3).toString(), "[1.0, 2.0, 3.0]");
    }
}