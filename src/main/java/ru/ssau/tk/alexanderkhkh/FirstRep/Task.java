package ru.ssau.tk.alexanderkhkh.FirstRep;

public class Task {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }

/*
Вывод в консоль:
Ignat
Arkadiy

Объект который мы передали в метод не используется, т.к. мы инициализировали новый, поэтому получился Игнат.
 */
}
