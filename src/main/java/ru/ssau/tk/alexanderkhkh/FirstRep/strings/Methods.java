package ru.ssau.tk.alexanderkhkh.FirstRep.strings;

import java.util.Objects;

public class Methods {

    public static void firstTask(String string){
        for(int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i));
        }
    }

    public static void secondTask(String string){
        byte[] bytes = string.getBytes();
        for (byte i:bytes) {
            System.out.println(i);
        }
    }

    /*public static void thirdTask(){
        String string = "abcde";
        String string1 = new String(string);
        System.out.println(string==string1);
        System.out.println(string.equals(string1));
    }*/

    public static boolean fourthTask(String string){
        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public static boolean fifthTask(String string1, String string2){
        return !Objects.equals(null, string1) && !Objects.equals(null, string2) && !string1.equals(string2) && string1.equalsIgnoreCase(string2);
    }

    public static void sixthTask(){
        int i = 0;
        System.out.println("Символ\t№" + ++i); // табуляция
        System.out.println("Символ\b№" + ++i); // удаление одного символа
        System.out.println("Символ\n№" + ++i); // переход на новую строку
        System.out.println("Символ\r№" + ++i); // вовзращение к началу строки
        //System.out.println("Символ\'№" + ++i); // апостроф
        System.out.println("Символ\"№" + ++i); // ковычки
        System.out.println("Символ\\№" + ++i); // знак \
    }

    public static int seventhTask(String string1, String string2){
       if (string1.indexOf(string2) == 0){
           return -1;
       }
       return string1.indexOf(string2);
    }

    public static int eighthTask(String string1, String string2){
        if(string1.indexOf(string2,string1.length()/2) == 0){
            return -1;
        }
        return string1.indexOf(string2,string1.length()/2);
    }

    public static int ninthTask(String string1, String string2){
        if(string1.lastIndexOf(string2,string1.length()/2) == 0){
            return -1;
        }
        return string1.lastIndexOf(string2,string1.length()/2);
    }
}
