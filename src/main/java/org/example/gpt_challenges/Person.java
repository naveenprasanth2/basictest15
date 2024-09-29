package org.example.gpt_challenges;

public record Person(String name, int age, String email) {
    void printDetails() {
        System.out.println(STR."Name: \{name}, Age: \{age}, Email: \{email}");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person person) {
            return this.name.equals(person.name);
        } else return false;
    }
}


class RecordExample {
    public static void main(String[] args) {
        Person person = new Person("Naveen", 28, "naveen@example.com");
        person.printDetails();
        Person anotherPerson = new Person("Naveen", 28, "naveedn@example.com");
        System.out.println("Are they equal? " + person.equals(anotherPerson));
    }
}