package ru.ssau.tk.alexanderkhkh.FirstRep.strings;

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

    public static void thirdTask(){
        String string = "abcde";
        String string1 = new String(string);
        System.out.println(string==string1);
        System.out.println(string.equals(string1));
    }

    public static boolean fourthTask(String string){
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
