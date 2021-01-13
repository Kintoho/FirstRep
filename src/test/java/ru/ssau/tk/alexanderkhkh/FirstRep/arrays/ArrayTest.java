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

        //2.21
        int[] array21 = new int[]{6, 6, 4, 4, 5, 5};
        assertEquals(Array.twentyFirstArray(array20), 2, 0.001);
        assertEquals(Array.twentyFirstArray(array21), 6, 0.001);

        //2.22
        assertEquals(Array.twentySecondArray(array21, 4), 2, 0.001);
        assertEquals(Array.twentySecondArray(array20, 4), 3, 0.001);

        //2.23
        int[] array22 = new int[]{1, 5, 6, 4};
        Array.twentyThirdArray(array22);
        assertEquals(array22[0], 6, 0.001);
        assertEquals(array22[2], 1, 0.001);
    }

    @Test
    public void testTwentyFourthArray(){
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        Array.twentyFourthArray(array);
        assertEquals(array[0],-2, 0.001);
        assertEquals(array[2],-4, 0.001);
        Array.twentyFourthArray(array);
        assertEquals(array[0],1, 0.001);
        assertEquals(array[2],3, 0.001);
    }

    @Test
    public void testTwentyFifthArray(){
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = Array.twentyFifthArray(array1);
        assertEquals(array2[0],-2, 0.001);
        assertEquals(array2[2],-4, 0.001);
        array2 = Array.twentyFifthArray(array2);
        assertEquals(array2[0],1, 0.001);
        assertEquals(array2[2],3, 0.001);
    }

    @Test
    public void testTwentySixthArray(){
        int[] array1_1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array1_2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] array2 = Array.twentySixthArray(array1_1);
        assertEquals(array2.length, 3, 0.001);
        assertEquals(array2[0], 3, 0.001);
        assertEquals(array2[1], 7, 0.001);
        assertEquals(array2[2], 11, 0.001);
        int[] array3 = Array.twentySixthArray(array1_2);
        assertEquals(array3.length, 4, 0.001);
        assertEquals(array3[0], 3, 0.001);
        assertEquals(array3[1], 7, 0.001);
        assertEquals(array3[2], 11, 0.001);
        assertEquals(array3[3], 7, 0.001);
    }

    @Test
    public void testTwentySeventhArray(){
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        boolean[] array2 = Array.twentySeventhArray(array);
        assertEquals(array2.length, 6, 0.001);
        assertTrue(array2[1]);
        assertFalse(array2[2]);
    }

    @Test
    public void testTwentyEighthFirstArray(){
        assertEquals(Array.twentyEighthFirstArray((long) 15.321), new int[]{0, 15});
        assertEquals(Array.twentyEighthSecondArray(Array.twentyEighthFirstArray((long) 300054332133.9)), (long)300054332133.9);
    }

    @Test
    public void testTwentyEighthSecondArray(){
        assertEquals(Array.twentyEighthSecondArray(new int[]{0, 15}), 15);
        assertEquals(Array.twentyEighthFirstArray(Array.twentyEighthSecondArray(new int[]{0, 15})), new int[]{0, 15});
    }

    @Test
    public void testTwentyNinthArray(){
        assertEquals(Array.twentyNinthArray(4, 2), new int[]{3,4,1,2});
    }

    @Test
    public void testThirtiethArray(){
        assertEquals(Array.ThirtiethArray(3), new int[][]{{1, 2, 3}, {4,5}, {6}});
    }

    @Test
    public void testThirtySecondArray() {
        Double[] array = new Double[]{Double.NaN, 1., 2.};
        Double[] array2 = new Double[]{1., 5., 3., 4.};
        Array.ThirtySecondArray(array);
        assertEquals(array[1], 1.);
        assertEquals(array[0], Double.NaN);
        Array.ThirtySecondArray(array2);
        assertEquals(array2[0], 1.);
        assertEquals(array2[1], 3.);
        assertEquals(array2[2], 4.);

    }

}