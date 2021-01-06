package ru.ssau.tk.alexanderkhkh.FirstRep;

public class Person {
    private String firstName;
    private String lastName;
    private int passportID;

    public Person(String firstName, String lastName, int passportID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(){
    }

    public Person(int passportID){
        this.passportID = passportID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassportID() {
        return passportID;
    }

    public void setPassportID(int passportID) {
        this.passportID = passportID;
    }
    public static void main(String[] args) {
        Person Sasha = new Person("Alexander", "Khkhlv");
        Person Pasha = new Person(123123);
    }
}

