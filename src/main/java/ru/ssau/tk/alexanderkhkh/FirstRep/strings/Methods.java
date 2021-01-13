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
}
