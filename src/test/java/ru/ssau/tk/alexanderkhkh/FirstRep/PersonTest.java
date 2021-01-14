package ru.ssau.tk.alexanderkhkh.FirstRep;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    public static final Person Pasha = new Person("Pasha", "Po", 312);
    public static Person Grisha = new Person();

    @Test
    public void testFirstName(){
        Grisha.setFirstName(null);
        assertNull(Grisha.getFirstName(), null);
        Grisha.setFirstName("Grisha");
        assertEquals(Grisha.getFirstName(), "Grisha");
        assertEquals(Pasha.getFirstName(), "Pasha");
    }

    @Test
    public void testLastName(){
        Grisha.setLastName(null);
        assertNull(Grisha.getLastName(), null);
        Grisha.setLastName("Ko");
        assertEquals(Grisha.getLastName(), "Ko");
        assertNotEquals(Pasha.getLastName(), "Ko");
        assertNotEquals(Grisha.getLastName(), "Po");
    }

    @Test
    public void testPassportID(){
        Grisha.setPassportID(123);
        assertEquals(Grisha.getPassportID(), 123, 0.001);
        assertEquals(Pasha.getPassportID(), 312, 0.001);
    }

    @Test
    public void testPerson(){
        Person Sasha = new Person("Alexander", "Khkhlv", 321);
        assertEquals(Sasha.getFirstName(), "Alexander");
        assertEquals(Sasha.getLastName(), "Khkhlv");
        assertEquals(Sasha.getPassportID(), 321, 0.001);

        Person NaturalBlond = new Person("Nicholas", "Baskov");
        assertEquals(NaturalBlond.getFirstName(), "Nicholas");
        assertEquals(NaturalBlond.getLastName(), "Baskov");

        Person id = new Person(321);
        assertEquals(id.getPassportID(), 321, 0.001);

        Person man = new Person();
        assertNotNull(man);

        Person Vasya = new Person("Vasya", "Maksimov", Person.Gender.Male);
        assertEquals(Vasya.getGender(), Person.Gender.Male);

        assertEquals(Sasha.toString(), "Alexander Khkhlv");
        Sasha.setLastName("");
        assertEquals(Sasha.toString(), "Alexander");
        Sasha.setFirstName("");
        assertEquals(Sasha.toString(), "");
    }
}