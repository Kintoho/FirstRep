package ru.ssau.tk.alexanderkhkh.FirstRep;

public class HelloWorld
{
    public static void main(String[] args) {
        System.out.println();
        Person Stepan = new Person("Stepan", "Stepanov", 432131);
        String fullName = Stepan.getFirstName() + " " + Stepan.getLastName();
        System.out.println(fullName + " say: Hello World!");

        Person Russia = new Person();
        Russia.setFirstName("Russian Federation");
        System.out.println(Russia.getFirstName() + " say: keep your passportID " + fullName+ " : " + Stepan.getPassportID());
    }
}
