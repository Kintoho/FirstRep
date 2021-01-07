package ru.ssau.tk.alexanderkhkh.FirstRep.arrays;

import static java.util.Arrays.sort;

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

    public static int[] fourthArray(int size){
        int[] array4 = new int[size];
        int k = 2;
        for(int i = (array4.length-1); i >=0; i--){
            array4[i]=k;
            k+=2;
        }
        return array4;
    }

    public static int[] fifthArray(int size){
        int[] array5 = new int[size];
        array5[0]=0;
        array5[1]=1;
        for (int i = 2; i < array5.length; i++) {
            array5[i] = array5[i-1]+array5[i-2];
        }
        return array5;
    }

    public static int[] sixthArray(int size){
        int[] array6 = new int[size];
        for (int i = 0; i < array6.length; i++){
            array6[i]=i*i;
        }
        return array6;
    }

    public static double[] quadraticEquation(double a, double b, double c){
        Double D = b*b - 4*a*c;
        double[] array;
        if(a==0){
            array = new double[1];
            array[0] = -c / b;
            return array;
        }
        else {
            if (D < 0) {
                array = new double[0];
                return array;
            } else if (D == 0) {
                array = new double[1];
                array[0] = -b / (2*a);
                return array;
            }
            else {
                array = new double[2];
                array[0]= (-b + Math.sqrt(D))/(2*a);
                array[1]= (-b - Math.sqrt(D))/(2*a);
                sort(array);
                return array;
            }
        }
    }

    public static int[] seventhArray(int size){
        int[] array7 = new int[size];
        int t = 1;
        for (int i = 0; i < array7.length; i++){
            if((t%3) != 0){
                array7[i]=t;
            }
            else{
                t++;
                array7[i]=t;
            }
            t++;
        }
        return array7;
    }
}
