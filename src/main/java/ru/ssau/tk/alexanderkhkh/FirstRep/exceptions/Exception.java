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

    public static char thirdTask(String[] arrayString, int n, int m) {
        if (n > arrayString.length) {
            throw new StringIndexOutOfBoundsException();
        }
        if (m > arrayString.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arrayString[n].charAt(m);
    }

    public static int fourthTask(String string1, String string2) {
        if (Integer.parseInt(string2) == 0) {
            throw new ArithmeticException();
        }
        if (!Character.isDigit(string1.charAt(0)) || !Character.isDigit(string2.charAt(0))) {
            throw new NumberFormatException();
        }
        return Integer.parseInt(string1) / Integer.parseInt(string2);
    }
}
