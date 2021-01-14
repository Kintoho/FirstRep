package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

import ru.ssau.tk.alexanderkhkh.FirstRep.Person;

public class Exception {

    public static String firstTask(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
