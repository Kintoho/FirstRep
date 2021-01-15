package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import org.testng.annotations.Test;
import ru.ssau.tk.alexanderkhkh.FirstRep.Person;

import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.*;

public class DriverTest {

    Driver Driver1 = new Driver();
    Driver Driver2 = new Driver();
    Driver Driver3 = new Driver();

    public void setDrivers() {
        Driver1.setId(1);
        Driver1.setName("Alexander");
        Driver1.setGender(Person.Gender.Male);
        Driver1.setLicenseExpirationDate(new Date(101, Calendar.JUNE, 17));

        Driver2.setId(2);
        Driver2.setName("Maria");
        Driver2.setGender(Person.Gender.Female);
        Driver2.setLicenseExpirationDate(new Date(91, Calendar.SEPTEMBER, 30));

        Driver3.setId(1);
        Driver3.setName("Pavel");
        Driver3.setGender(Person.Gender.Male);
        Driver3.setLicenseExpirationDate(new Date(100, Calendar.JUNE, 20));
    }

    @Test
    public void testTestEquals() {
        setDrivers();
        assertTrue(Driver1.equals(Driver3));
        assertTrue(Driver1.equals(Driver1));
        assertTrue(Driver3.equals(Driver1));
        assertFalse(Driver1.equals(Driver2));
        assertFalse(Driver1.equals(null));
        assertFalse(Driver1.equals(new Person()));
    }

    @Test
    public void testTestToString() {
        setDrivers();
        assertEquals(Driver1.toString(), "Driver. id: 1; name: Alexander; gender: Male; licenseExpirationDate: Sun Jun 17 00:00:00 YEKST 2001");
        assertEquals(Driver2.toString(), "Driver. id: 2; name: Maria; gender: Female; licenseExpirationDate: Mon Sep 30 00:00:00 YEKT 1991");
    }
}