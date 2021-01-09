package ru.ssau.tk.alexanderkhkh.FirstRep.arrays;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ArrayTest {

    @Test
    public void testArray() {
        int[] array1 = Array.firstArray(5);
        assertEquals(array1.length, 5, 0.001);

        int[] array2 = Array.secondArray(5);
        assertEquals(array2.length, 5, 0.001);
        assertEquals(array2[0], 2, 0.001);
        assertEquals(array2[4], 2, 0.001);
        assertEquals(array2[2], 1, 0.001);

        int[] array3 = Array.thirdArray(5);
        assertEquals(array3.length, 5, 0.001);
        assertEquals(array3[0], 1, 0.001);
        assertEquals(array3[2], 5, 0.001);
        assertEquals(array3[4], 9, 0.001);

        int[] array4 = Array.fourthArray(5);
        assertEquals(array4.length, 5, 0.001);
        assertEquals(array4[0], 10, 0.001);
        assertEquals(array4[2], 6, 0.001);
        assertEquals(array4[4], 2, 0.001);

        int[] array5 = Array.fifthArray(8);
        assertEquals(array5.length, 8, 0.001);
        assertEquals(array5[2], 1, 0.001);
        assertEquals(array5[6], 8, 0.001);
        assertEquals(array5[3], 2, 0.001);
        assertEquals(array5[7], 13, 0.001);

        int[] array6 = Array.sixthArray(6);
        assertEquals(array6.length, 6, 0.001);
        assertEquals(array6[2], 4, 0.001);
        assertEquals(array6[5], 25, 0.001);
        assertEquals(array6[0], 0, 0.001);

        double[] radical1 = Array.quadraticEquation(1, 4, 4);
        assertEquals(radical1[0], -2, 0.001);
        assertEquals(radical1.length, 1, 0.001);
        double[] radical2 = Array.quadraticEquation(0, 4, 4);
        assertEquals(radical2[0], -1, 0.001);
        assertEquals(radical2.length, 1, 0.001);
        double[] radical3 = Array.quadraticEquation(1, 4, 10);
        assertEquals(radical3.length, 0, 0.001);
        double[] radical4 = Array.quadraticEquation(1, -3, -4);
        assertEquals(radical4.length, 2, 0.001);
        assertEquals(radical4[0], -1, 0.001);
        assertEquals(radical4[1], 4, 0.001);

        int[] array7 = Array.seventhArray(10);
        assertEquals(array7.length, 10, 0.001);
        assertEquals(array7[0], 1, 0.001);
        assertEquals(array7[1], 2, 0.001);
        assertEquals(array7[2], 4, 0.001);
        assertEquals(array7[3], 5, 0.001);

        int[] array8 = Array.eighthArray(8,2 ,3 );
        assertEquals(array8.length, 8, 0.001);
        assertEquals(array8[0], 2, 0.001);
        assertEquals(array8[1], 5, 0.001);
        assertEquals(array8[2], 8, 0.001);
        assertEquals(array8[3], 11, 0.001);

        int[] array9 = Array.ninthArray(9,2 ,3 );
        assertEquals(array9.length, 9, 0.001);
        assertEquals(array9[0], 2, 0.001);
        assertEquals(array9[1], 6, 0.001);
        assertEquals(array9[2], 18, 0.001);
        assertNotEquals(array9[3], 40, 0.001);

        ArrayList<Integer> array10 = Array.tenthArray(4 );
        assertEquals(array10.get(0), 1, 0.001);
        assertEquals(array10.get(1), 2, 0.001);

        ArrayList<Integer> array11 = Array.eleventhArray(20 );
        assertEquals(array11.get(0), 2, 0.001);
        assertEquals(array11.get(1), 3, 0.001);
        assertEquals(array11.get(2), 5, 0.001);
        assertEquals(array11.get(3), 7, 0.001);
        assertEquals(array11.get(4), 11, 0.001);

        int[] array12 = Array.twelfthArray(7);
        assertEquals(array12.length, 7, 0.001);
        assertEquals(array12[0], 1, 0.001);
        assertEquals(array12[1], 2, 0.001);
        assertEquals(array12[2], 3, 0.001);
        assertEquals(array12[3], 4, 0.001);
        assertEquals(array12[4], 3, 0.001);
        assertEquals(array12[5], 2, 0.001);
        assertEquals(array12[6], 1, 0.001);

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, -7};
        Array.fourteenthArray(numbers);
        assertEquals(numbers.length, 7, 0.001);
        assertEquals(numbers[0], -1, 0.001);
        assertEquals(numbers[1], -2, 0.001);
        assertEquals(numbers[2], -3, 0.001);
        assertEquals(numbers[3], -4, 0.001);
        assertEquals(numbers[4], -5, 0.001);
        assertEquals(numbers[5], -6, 0.001);
        assertEquals(numbers[6], 7, 0.001);

        //2.15
        assertTrue(Array.fifteenthArray(numbers, 5));
        assertFalse(Array.fifteenthArray(numbers, 7));

        //2.16
        Integer[] array16_1 = new Integer[]{1,2,3,null};
        assertTrue(Array.sixteenthArray(array16_1));
        Integer[] array16_2 = new Integer[]{1,2,3,0};
        assertFalse(Array.sixteenthArray(array16_2));

        //2.17
        assertEquals(Array.seventeenthArray(numbers), 3, 0.001);
        assertNotEquals(Array.seventeenthArray(numbers), 2, 0.001);

        //2.18
        int[] array18_1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array18_2 = new int[]{10, 2, 3, 4, 5, 6};
        int[] voidArray = new int[0];
        assertEquals(Array.eighteenthArray(array18_1), 6, 0.001);
        assertEquals(Array.eighteenthArray(array18_2), 10, 0.001);
        assertNull(Array.eighteenthArray(voidArray));

        //2.19
        assertEquals(Array.nineteenthArray(array18_1), 8, 0.001 );
        assertEquals(Array.nineteenthArray(array18_2), 8, 0.001 );
        assertNull(Array.nineteenthArray(voidArray));

        //2.20
        int[] array20 = new int[]{2, 2, 9, 4, 5, 3};
        assertTrue(Array.twentiethArray(array20));
        assertFalse(Array.twentiethArray(array18_2));
    }
}