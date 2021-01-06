package ru.ssau.tk.alexanderkhkh.FirstRep;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.alexanderkhkh.FirstRep.Points.*;

public class PointsTest {
    public static final Point point1 = new Point(1, 2, 3);
    public static final Point point2 = new Point(4, 5, 6);
    public static Point point3;

    @Test
    public void testSum() {
        point3 = sum(point1, point2);
        assertEquals(point3.getX(), 5, 0.001);
        assertEquals(point3.getY(), 7, 0.001);
        assertEquals(point3.getZ(), 9, 0.001);
    }

    @Test
    public void testSubstract() {
        point3 = substract(point1,point2);
        assertEquals(point3.getX(), -3, 0.001);
        assertEquals(point3.getY(), -3, 0.001);
        assertEquals(point3.getZ(), -3, 0.001);
    }

    @Test
    public void testMultiply() {
        point3 = multiply(point1,point2);
        assertEquals(point3.getX(), 4, 0.001);
        assertEquals(point3.getY(), 10, 0.001);
        assertEquals(point3.getZ(), 18, 0.001);
    }

    @Test
    public void testDivide() {
        point3 = divide(point1,point2);
        assertEquals(point3.getX(), 0.25, 0.001);
        assertEquals(point3.getY(), 0.4, 0.001);
        assertEquals(point3.getZ(), 0.5, 0.001);
    }

    @Test
    public void testEnlarge() {
        point3 = enlarge(point1, 3);
        assertEquals(point3.getX(), 3, 0.001);
        assertEquals(point3.getY(), 6, 0.001);
        assertEquals(point3.getZ(), 9, 0.001);
    }

    @Test
    public void testLength() {
        assertEquals(point1.length(), 3.7, 0.1);
    }

    @Test
    public void testOpposite() {
        point3 = opposite(point2);
        assertEquals(point3.getX(), -4, 0.001);
        assertEquals(point3.getY(), -5, 0.001);
        assertEquals(point3.getZ(), -6, 0.001);
    }

    @Test
    public void testInverse() {
        point3 = inverse(point1);
        assertEquals(point3.getX(), 1, 0.001);
        assertEquals(point3.getY(), 0.5, 0.001);
        assertEquals(point3.getZ(), 0.33333, 0.001);
    }

    @Test
    public void testScalarProduct() {
        assertEquals(scalarProduct(point1, point2), 32, 0.001);
    }

    @Test
    public void testVectorProduct() {
        point3 = vectorProduct(point1,point2);
        assertEquals(point3.getX(), -3, 0.001);
        assertEquals(point3.getY(), 6, 0.001);
        assertEquals(point3.getZ(), -3, 0.001);
    }
}