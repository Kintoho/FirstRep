package ru.ssau.tk.alexanderkhkh.FirstRep.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MethodsTest {

    @Test
    public void testFirstTask(){
        String string = ("abcde");
        Methods.firstTask(string);
    }

    @Test
    public void testSecondTask(){
        String string1 = "abcde";
        Methods.secondTask(string1);
        System.out.println("\n");
        String string2 = "абвгд";
        Methods.secondTask(string2);
    }

   /* @Test
    public void testThirdTask(){
        Methods.thirdTask();
    }*/

    @Test
    public void testFourthTask(){
        assertTrue(Methods.fourthTask("abcba"));
        assertFalse(Methods.fourthTask("abcde"));
        assertTrue(Methods.fourthTask("a"));
    }

    @Test
    public void testFifthTask(){
        String string1 = "Abc";
        String string2 = "abc";
        String string3 = "Bac";
        assertTrue(Methods.fifthTask(string1, string2));
        assertFalse(Methods.fifthTask(string2, string3));
        assertFalse(Methods.fifthTask(string1, null));
        assertFalse(Methods.fifthTask(null, null));
    }

    @Test
    public void testSixthTask(){
        Methods.sixthTask();
    }

    @Test
    public void testSeventhTask(){
        assertEquals(Methods.seventhTask("abcabcabc","ca"),2);
        assertEquals(Methods.seventhTask("abcabcabc","lolo"),-1);
    }

    @Test
    public void testEighthTask(){
        assertEquals(Methods.eighthTask("abcabcabc","ca"), 5);
        assertEquals(Methods.seventhTask("abcabcabc","lolo"),-1);
    }

    @Test
    public void testNinthTask(){
        assertEquals(Methods.ninthTask("abcde","cde"),2);
        assertEquals(Methods.ninthTask("Hello","ll"),2);
    }

    @Test
    public void testTenthTask(){
        String[] strings = new String[]{"abcabc","abababa","a","arr", "acer"};
        assertEquals(Methods.tenthTask(strings,"a","a"),2);
        assertEquals(Methods.tenthTask(strings,"a","r"),2);
    }

    @Test
    public void testEleventhTask(){
        String[] strings = new String[]{"  abcabc  ", "  abababa ", " a ", " arr ", " acer "};
        assertEquals(Methods.eleventhTask(strings,"a","a"),2);
        assertEquals(Methods.eleventhTask(strings,"a","r"),2);
    }

    @Test
    public void testTwelfthTask(){
        assertEquals(Methods.twelfthTask("opopopopo", "opo", "po"), "popppo");
    }

    @Test
    public void testThirtiethTask(){
        String string = "Hello world hello world";
        int size = string.length();
        assertEquals(Methods.thirtiethTask(string, -2, size), string);
        assertEquals(Methods.thirtiethTask(string, 2, 1), "");
        assertEquals(Methods.thirtiethTask(string, 0, 5), "Hello");
    }

    @Test
    public void testNineteenthTask(){
        String string = "hello world!";
        String[] arrayString = Methods.nineteenthTask(string);
        for (String strings : arrayString) {
            System.out.print(strings + " ");
        }
    }
}