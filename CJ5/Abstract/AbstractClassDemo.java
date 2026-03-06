package CJ5.Abstract;

abstract class Animal {

    // Abstract method
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
