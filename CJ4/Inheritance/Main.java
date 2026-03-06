package CJ4.Inheritance;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void print(Person p) {
        System.out.println("Person name: " + p.name);
    }

    void show() {
        print(this);  // passing current object
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("John");
        p.show();
    }
}
