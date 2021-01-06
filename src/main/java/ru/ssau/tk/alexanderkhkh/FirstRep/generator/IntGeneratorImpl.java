package ru.ssau.tk.alexanderkhkh.FirstRep.generator;

public class IntGeneratorImpl implements IntGenerator{
    private int i = 0;

    @Override
    public int nextInt() {
        return i++;
    }
}
