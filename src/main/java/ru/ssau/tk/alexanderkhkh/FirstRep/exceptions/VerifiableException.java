package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

public class VerifiableException extends Throwable {
    public static void throwVerifiableException() throws VerifiableException {
        throw new VerifiableException();
    }

    public static VerifiableException throwUnVerifiableException() {
        try {
            throwVerifiableException();
        } catch (VerifiableException e) {
            throw new UnVerifiableException(e);
        }
        return null;
    }
}
