package ru.ssau.tk.alexanderkhkh.FirstRep.strings;

import org.testng.annotations.Test;
import ru.ssau.tk.alexanderkhkh.FirstRep.NamedPoint;
import ru.ssau.tk.alexanderkhkh.FirstRep.Person;
import ru.ssau.tk.alexanderkhkh.FirstRep.Point;
import ru.ssau.tk.alexanderkhkh.FirstRep.arrays.Matrix;

import static org.testng.Assert.*;

public class DescriptionTest {

    @Test
    public void testGetDescription() {

        Matrix matrix = new Matrix(3, 3);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(0, 2, 3);
        matrix.setAt(1, 0, 4);
        matrix.setAt(1, 1, 5);
        matrix.setAt(1, 2, 6);
        matrix.setAt(2, 0, 7);
        matrix.setAt(2, 1, 8);
        matrix.setAt(2, 2, 9);
        Description.getDescription(matrix);
        Description.getDescription(new Person("Alexander", "Khkhlv"));
        Description.getDescription(new Point(1, 2, 3));
        Description.getDescription(new NamedPoint(3, 3, 3, "A"));
    }
}