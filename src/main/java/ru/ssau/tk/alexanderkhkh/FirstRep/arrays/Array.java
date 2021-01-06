package ru.ssau.tk.alexanderkhkh.FirstRep.arrays;

public class Array {
    public static int[] firstArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        return array;
    }
}
