package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import ru.ssau.tk.alexanderkhkh.FirstRep.Person;

import java.util.Comparator;

public class DriversComparator implements Comparator<Driver> {

    @Override
    public int compare(Driver driver1, Driver driver2) {
        if (driver1.getGender() != driver2.getGender()) {
            if (driver1.getGender() == Person.Gender.Female) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return Long.compare(driver1.getLicenseExpirationDate().getTime(), driver2.getLicenseExpirationDate().getTime());
        }
    }
}