package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

import org.testng.Assert;
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
}