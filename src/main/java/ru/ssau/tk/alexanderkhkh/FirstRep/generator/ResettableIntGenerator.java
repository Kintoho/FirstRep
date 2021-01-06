package ru.ssau.tk.alexanderkhkh.FirstRep.generator;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    private int i = 0;

    @Override
    public int nextInt() {
        return i++;
    }

    @Override
    public void reset() {
        i = 0;
    }
}
