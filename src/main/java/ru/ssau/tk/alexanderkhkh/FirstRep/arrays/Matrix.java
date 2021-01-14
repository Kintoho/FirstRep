package ru.ssau.tk.alexanderkhkh.FirstRep.arrays;

public class Matrix {

    private final double[][] array;
    private final int n;
    private final int m;

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public Matrix(int n, int m) {
        this.m = m;
        this.n = n;
        array = new double[n][m];
    }

    public double getAt(int n, int m) {
        return array[n][m];
    }

    public void setAt(int n, int m, double number) {
        array[n][m] = number;
    }
}
