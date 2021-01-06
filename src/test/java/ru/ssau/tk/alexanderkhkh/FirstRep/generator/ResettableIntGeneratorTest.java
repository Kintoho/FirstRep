package ru.ssau.tk.alexanderkhkh.FirstRep.generator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    ResettableIntGenerator resettableIntGenerator = new ResettableIntGenerator();

    @Test
    public void testNextInt() {
        assertEquals(resettableIntGenerator.nextInt(), 0);
        assertEquals(resettableIntGenerator.nextInt(), 1);
    }

    @Test
    public void testReset() {
        assertEquals(resettableIntGenerator.nextInt(), 2);
        resettableIntGenerator.reset();
        assertEquals(resettableIntGenerator.nextInt(), 0);
    }
}