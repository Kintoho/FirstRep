package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.alexanderkhkh.FirstRep.Person;

public class ExceptionTest {

    @Test
    public void testFirstTask() {
        Person Sasha = new Person("Alexander", "Khkhlv");
        Assert.assertEquals(Exception.firstTask(Sasha), "Alexander Khkhlv");
        Person nullPerson = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> Assert.assertNull(nullPerson));
    }
}