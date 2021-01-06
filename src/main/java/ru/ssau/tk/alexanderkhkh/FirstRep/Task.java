package ru.ssau.tk.alexanderkhkh.FirstRep;

public class Task {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        System.out.println(person.getFirstName());
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }
/*
Вывод в консоль:
10
Oleg
5
Oleg

Так получается, потому поле number и переменная number в классе checkInt, не одно и то же, поэтому полю number не присваивается значение 10,
и во втором случае выводится значение 5. Сеттер же переприсваивает ссылку на объект.
 */
}
