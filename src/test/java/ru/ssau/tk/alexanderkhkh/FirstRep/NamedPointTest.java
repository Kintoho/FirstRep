package ru.ssau.tk.alexanderkhkh.FirstRep;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    @Test
    public void testNamedPoint(){
        NamedPoint namedPoint1 = new NamedPoint(1, 2, 3, "РазДваТри");
        assertEquals(namedPoint1.getX(), 1, 0.001);
        assertEquals(namedPoint1.getName(), "РазДваТри");

        NamedPoint namedPoint2 = new NamedPoint(4,5,6);
        namedPoint2.setName("456");
        assertEquals(namedPoint2.getName(), "456");
    }
}