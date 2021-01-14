package ru.ssau.tk.alexanderkhkh.FirstRep;

import java.io.Serializable;

public class Person implements Serializable {
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

    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
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

    public enum Gender {Male, Female}

    Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person(String firstName, String lastName, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
}

