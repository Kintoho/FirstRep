package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

import org.testng.annotations.Test;
import ru.ssau.tk.alexanderkhkh.FirstRep.Person;
import static org.testng.Assert.*;

public class ExceptionTest {

    @Test
    public void testFirstTask() {
        Person Sasha = new Person("Alexander", "Khkhlv");
        assertEquals(Exception.firstTask(Sasha), "Alexander Khkhlv");
        Person nullPerson = new Person(null, null);
        assertThrows(NullPointerException.class, () -> Exception.firstTask(nullPerson));
    }

    @Test
    public void testSecondTask() {
        String[] string = {"Hello", "world", "!"};
        assertEquals(Exception.secondTask(string, 0), new String[]{"H", "w", "!"});
        assertThrows(StringIndexOutOfBoundsException.class,
                () -> assertEquals(Exception.secondTask(string, 1),
                        new String[]{"e", "o", ""}));

        assertThrows(NullPointerException.class,
                () -> assertNull(Exception.secondTask(null, 0)));
        String[] string1 = {null, "null"};
        assertThrows(NullPointerException.class,
                () -> assertNull(Exception.secondTask(string1, 0)));
    }

    @Test
    public void testThirdTask(){
        String[] arrayStr = new String[]{"Hello","world","!"};
        assertEquals(Exception.thirdTask(arrayStr,0,0),
                'H');
        assertThrows(StringIndexOutOfBoundsException.class,
                () -> Exception.thirdTask(arrayStr,20,0));
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Exception.thirdTask(arrayStr,0,20));
    }

    @Test
    public void testGetIntOfString() {
        assertEquals(Exception.fourthTask("10","5"), 2, 0.001);
        assertThrows(ArithmeticException.class,
                () ->   Exception.fourthTask("10","0"));
        assertThrows(NumberFormatException.class,
                () ->    Exception.fourthTask("a","1"));
        assertThrows(NumberFormatException.class,
                () ->    Exception.fourthTask("a","b"));
    }
}