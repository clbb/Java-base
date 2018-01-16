package com.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person edison = new Person("Edison");

        String name = edison.getName();
        System.out.println("Person 1: " + name);

        Person billGate = new Person("Bill Gates");

        String name2 = billGate.name;
        System.out.println("Person 2: " + name2);

    }

}
