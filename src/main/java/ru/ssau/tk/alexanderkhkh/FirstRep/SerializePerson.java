package ru.ssau.tk.alexanderkhkh.FirstRep;

import java.io.*;

public class SerializePerson implements Serializable {
    public static void serialize(OutputStream outputStream, Object o) throws IOException {
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(o);
        objectOutputStream.flush();
    }
}
