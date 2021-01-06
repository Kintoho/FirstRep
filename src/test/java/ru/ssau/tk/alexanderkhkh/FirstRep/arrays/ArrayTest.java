package ru.ssau.tk.alexanderkhkh.FirstRep.arrays;

import org.testng.annotations.Test;

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
    }
}