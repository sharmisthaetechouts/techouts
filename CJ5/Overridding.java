package CJ5;

public class Overridding {
    public static class Animal{

        void makeSound(){
            System.out.println("Hello from animal");
        }
    }
        static class Dog extends Animal{
            void makeSound(){  //@override 
            System.out.println("Hello from Dog");
        }
           //void eat(){
           // System.out.println("lets eat");
         //  }
    
}
    public static void main(String[] args) {
        Animal a =new Dog();
        a.makeSound();
//a.eat(); // like i have to declare the eat() in Animal class as well then the undefined error will noyt come

    }
    
}
