package ru.ssau.tk.alexanderkhkh.FirstRep;

import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.*;
import static ru.ssau.tk.alexanderkhkh.FirstRep.SerializePerson.serialize;

public class SerializePersonTest {

    @Test
    public void testSerialize(){
        Person obj = new Person();
        String fileName = "";
        assertThrows(FileNotFoundException.class, () -> serialize(new ObjectOutputStream(new FileOutputStream(fileName)), obj));
    }

}