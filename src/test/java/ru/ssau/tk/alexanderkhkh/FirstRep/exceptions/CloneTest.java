package ru.ssau.tk.alexanderkhkh.FirstRep.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CloneTest {

    @Test
    public void testClone() {
        CloneFirst clone1 = new CloneFirst();
        CloneSecond clone2 = new CloneSecond();
        try {
            clone1.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Assert.assertThrows(CloneNotSupportedException.class, clone2::clone);
    }
}
