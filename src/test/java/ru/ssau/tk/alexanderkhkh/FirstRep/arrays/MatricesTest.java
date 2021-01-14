package ru.ssau.tk.alexanderkhkh.FirstRep.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatricesTest {

    @Test
    public void testGetMatrixMultiplyOnNumber() {
        Matrix matrix = new Matrix(2,2);
        matrix.setAt(0,0,1);
        matrix.setAt(0,1,1);
        matrix.setAt(1,1,1);
        matrix.setAt(1,0,1);
        Matrices.getMatrixMultiplyOnNumber(matrix,5);
        assertEquals(matrix.getAt(0,0),1.);
        assertEquals(Matrices.getMatrixMultiplyOnNumber(matrix,5).getAt(0,0),matrix.getAt(0,0)*5);
    }

    @Test
    public void testGetMatrixPlus() {
        Matrix matrix1 = new Matrix(2,2);
        matrix1.setAt(0,0,1);
        matrix1.setAt(0,1,1);
        matrix1.setAt(1,1,1);
        matrix1.setAt(1,0,1);
        Matrix matrix2 = new Matrix(2,2);
        matrix2.setAt(0,0,1);
        matrix2.setAt(0,1,1);
        matrix2.setAt(1,1,1);
        matrix2.setAt(1,0,1);
        assertEquals(Matrices.getMatrixPlus(matrix1,matrix2).getAt(0,0),matrix1.getAt(0,0)+matrix2.getAt(0,0));
    }

    @Test
    public void testChekMatrixSize() {
        Matrix matrix1 = new Matrix(2,2);
        Matrix matrix2 = new Matrix(3,3);
        assertTrue(Matrices.checkMatrixSize(matrix1, matrix2));
    }

    @Test
    public void testGetMatrixMultiply() {
        Matrix matrix1 = new Matrix(2,2);
        matrix1.setAt(0,0,4);
        matrix1.setAt(0,1,1);
        matrix1.setAt(1,1,6);
        matrix1.setAt(1,0,8);
        Matrix matrix2 = new Matrix(2,2);
        matrix2.setAt(0,0,0);
        matrix2.setAt(0,1,1);
        matrix2.setAt(1,1,0);
        matrix2.setAt(1,0,1);
        Matrix result =  Matrices.getMatrixMultiply(matrix1,matrix2);
        assertEquals(result.getAt(0,0),1.);
        assertEquals(result.getAt(0,1),0.);
        assertEquals(result.getAt(1,0),6.);
    }
}