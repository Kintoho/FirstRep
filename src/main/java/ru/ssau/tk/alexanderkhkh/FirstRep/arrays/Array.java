package ru.ssau.tk.alexanderkhkh.FirstRep.arrays;

public class Array {
    public static int[] firstArray(int size) {
        int[] array1 = new int[size];
        return array1;
    }

    public static int[] secondArray(int size){
        int[] array2 = new int[size];
        array2[0]=2;
        for (int i = 1; i < array2.length-1; i++) {
            array2[i] = 1;
        }
        array2[array2.length-1]=2;
        return array2;
    }

    public static int[] thirdArray(int size){
        int[] array3 = new int[size];
        int k = 1;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = k;
            k+=2;
        }
        return array3;
    }
}
