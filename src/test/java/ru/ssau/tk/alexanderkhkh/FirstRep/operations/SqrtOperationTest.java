package ru.ssau.tk.alexanderkhkh.FirstRep.operations;

import org.testng.annotations.Test;

import static java.lang.Double.*;
import static org.testng.Assert.*;

public class SqrtOperationTest {
    private final static Operation operation = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(operation.apply(16), 4, 0.001);
        assertEquals(operation.apply(NEGATIVE_INFINITY), NaN, 0.001);
        assertEquals(operation.apply(POSITIVE_INFINITY), POSITIVE_INFINITY, 0.001);
        assertEquals(operation.apply(NaN), NaN, 0.001);
    }

    @Test
    public void testApplyTriple(){
        assertEquals(operation.applyTriple(256), 2, 0.001);
        assertEquals(operation.applyTriple(NEGATIVE_INFINITY), NaN, 0.001);
        assertEquals(operation.applyTriple(POSITIVE_INFINITY), POSITIVE_INFINITY, 0.001);
        assertEquals(operation.applyTriple(NaN), NaN, 0.001);
    }
}