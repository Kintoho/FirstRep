package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

public class UnVerifiableException extends RuntimeException {
    UnVerifiableException(VerifiableException e) {
        super(e);
    }
}
