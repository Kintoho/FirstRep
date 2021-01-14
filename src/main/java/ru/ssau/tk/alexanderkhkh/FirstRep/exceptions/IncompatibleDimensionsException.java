package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

public class IncompatibleDimensionsException extends RuntimeException{

    public IncompatibleDimensionsException() {
        this("Матрицы несовместимы!");
    }

    public IncompatibleDimensionsException(String str) {
        System.out.println(str);
    }
}
