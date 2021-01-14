package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

import ru.ssau.tk.alexanderkhkh.FirstRep.Person;

public class Exception {

    public static String firstTask(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }

    public static String[] secondTask(String[] string, int n) {
        String[] newString = new String[string.length];
        for (String s : string) {
            if (n > s.length()) {
                throw new StringIndexOutOfBoundsException();
            }
        }
        for (String s : string) {
            if (s == null) {
                throw new NullPointerException();
            }
        }
        for (int i = 0; i < string.length; i++) {
            newString[i] = string[i].substring(n, n + 1);
        }
        return newString;
    }
}
