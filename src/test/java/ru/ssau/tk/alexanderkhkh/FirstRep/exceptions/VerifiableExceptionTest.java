package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

import org.testng.annotations.Test;

import static ru.ssau.tk.alexanderkhkh.FirstRep.exceptions.VerifiableException.throwVerifiableException;

public class VerifiableExceptionTest {

    @Test
    public void test() {
        try {
            throwVerifiableException();
        } catch (VerifiableException e) {
            e.getCause();
        }
    }
}
