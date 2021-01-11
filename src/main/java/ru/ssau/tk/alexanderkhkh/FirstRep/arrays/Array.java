package ru.ssau.tk.alexanderkhkh.FirstRep.arrays;

import java.util.ArrayList;

import static java.util.Arrays.sort;

public class Array {
    public static int[] firstArray(int size) {
        return new int[size];
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
        double D = b*b - 4*a*c;
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

    public static int[] eighthArray(int size, int a, int b){
        int[] array8 = new int[size];
        array8[0]=a;
        for (int i = 1; i < array8.length; i++){
            array8[i]=array8[i-1]+b;
        }
        return array8;
    }

    public static int[] ninthArray(int size, int a, int b){
        int[] array9 = new int[size];
        array9[0]=a;
        for (int i = 1; i < array9.length; i++){
            array9[i]=array9[i-1]*b;
        }
        return array9;
    }

    public static ArrayList<Integer> tenthArray(int a){
        ArrayList<Integer> array10 = new ArrayList<>(); // надеюсь, можно было делать через него :)
        for (int i = 1; i <= Math.sqrt(a); i++){
            if((a%i)==0){
                array10.add(i);
            }
        }
        return array10;
    }

    public static ArrayList<Integer> eleventhArray(int a){
        ArrayList<Integer> array11 = new ArrayList<>();
        for(int i = 2; i <= a; i++){
            int k = 0;
            for( int j = 2; j < a; j++){
                if(i%j == 0){
                    k++;
                }
            }
            if (k==1){
                array11.add(i);
            }
        }
        return array11;
    }

    public static int[] twelfthArray(int size){
        int[] array12 = new int[size];
        int k = 1;
        for (int i = 0; i < array12.length/2; i++){
            array12[i]=k;
            k++;
        }
        for (int j = array12.length/2; j < array12.length; j++){
            array12[j]=k;
            k--;
        }
        return array12;
    }

    public static void fourteenthArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            numbers[i]= -numbers[i];
        }
    }

    public static boolean fifteenthArray(int[] numbers, int a){
        for (int i = 0; i < numbers.length; i++){
            if(a==i){
                return true;
            }
        }
        return false;
    }

    public static boolean sixteenthArray(Integer[] numbers){
        for (Integer number : numbers) {
            if (number == null) {
                return true;
            }
        }
        return false;
    }

    public static int seventeenthArray(int[] numbers){
        int k = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    public static Integer eighteenthArray(int[] numbers){
        int k = 0;
        if(numbers.length == 0){
            return null;
        }
        for (int i = 0; i < numbers.length-1; i++ ) {
            if(numbers[i] <= numbers[i+1]){
                k = numbers[i+1];
            }
        }
        if (numbers[0] > numbers[numbers.length-1]){
            k = numbers[0];
        }
        return k;
    }

    public static Integer nineteenthArray(int[] numbers){
        int k = 0;
        if(numbers.length == 0){
            return null;
        }
        for (int i = 2; i < numbers.length; i++ ) {
            if(i%2 == 0){
                k = k + numbers[i];
            }
        }

        return k;
    }

    public static boolean twentiethArray(int[] numbers){
        int k = 0;
        int m = 0;
        for (int number : numbers) {
            if (number % numbers[0] == 0) {
                k++;
            }
            if (number % numbers[numbers.length - 1] == 0) {
                m++;
            }
        }
        return k > m;
    }

    public static int twentyFirstArray(int[] numbers){
        int k = 0;
        int[] array = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            for (int number : numbers) {
                if (numbers[i] == number) {
                    k++;
                }
            }
            array[i] = k;
            k = 0;
        }
        int m = eighteenthArray(array); //элемент, встречающийся максимальное кол-во раз

        for(int i = 0; i < numbers.length; i++){
            if (array[i] == m){
                return numbers[i];
            }
        }
        return -1;
    }

    public static int twentySecondArray(int[] numbers, int a){
        for (int i = 0; i < numbers.length; i++){
            if (a == numbers[i]){
                return i;
            }
        }
        return -1;
    }
}
