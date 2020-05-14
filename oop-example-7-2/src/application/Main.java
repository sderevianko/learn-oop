package application;

import Person.Person;

public class Main {

    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person("Elisabeth Chase Olsen",31);

        b.talk();
    }
}
