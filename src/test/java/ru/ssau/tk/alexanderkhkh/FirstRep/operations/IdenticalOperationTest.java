package ru.ssau.tk.alexanderkhkh.FirstRep.operations;

import org.testng.annotations.Test;

import static java.lang.Double.*;
import static java.lang.Double.NaN;
import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private final static Operation operation = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(operation.apply(16), 16, 0.001);
        assertEquals(operation.apply(NEGATIVE_INFINITY), NEGATIVE_INFINITY, 0.001);
        assertEquals(operation.apply(POSITIVE_INFINITY), POSITIVE_INFINITY, 0.001);
        assertEquals(operation.apply(NaN), NaN, 0.001);
    }

    @Test
    public void testApplyTriple(){
        assertEquals(operation.applyTriple(16), 16, 0.001);
        assertEquals(operation.applyTriple(NEGATIVE_INFINITY), NEGATIVE_INFINITY, 0.001);
        assertEquals(operation.applyTriple(POSITIVE_INFINITY), POSITIVE_INFINITY, 0.001);
        assertEquals(operation.applyTriple(NaN), NaN, 0.001);
    }
}