package ru.ssau.tk.alexanderkhkh.FirstRep;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person Pasha = new Person("Pasha", "Po", 312);
    Person Grisha = new Person();
    @Test
    public void testGetFirstName() {
        assertEquals(Pasha.getFirstName(), "Pasha");
    }

    @Test
    public void testSetFirstName() {
        Grisha.setFirstName("Grisha");
        assertEquals(Grisha.getFirstName(), "Grisha");
    }

    @Test
    public void testGetLastName() {
        assertEquals(Pasha.getLastName(), "Po");
    }

    @Test
    public void testSetLastName() {
        Grisha.setLastName("Ko");
        assertNotEquals(Grisha.getLastName(), "Po");
    }

    @Test
    public void testGetPassportID() {
        assertEquals(Pasha.getPassportID(), 312, 0.001);
    }

    @Test
    public void testSetPassportID() {
        Grisha.setPassportID(311);
        assertNotEquals(Grisha.getPassportID(), 312, 0.001);
    }

}