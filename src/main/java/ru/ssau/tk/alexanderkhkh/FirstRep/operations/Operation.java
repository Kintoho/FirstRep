package ru.ssau.tk.alexanderkhkh.FirstRep.operations;

public abstract class Operation {
    public abstract double apply(double number);


    public double applyTriple(double number){
        return apply(apply(apply(number)));
    }
}
