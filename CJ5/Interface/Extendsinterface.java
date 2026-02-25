package CJ5.Interface;

interface  LivingBeing{
     void breathe();
}

interface Animal extends LivingBeing{


    void eat();

}

interface Pet extends Animal{
    void play();
}

class Cat  implements Pet{
    public void breathe(){
        System.out.println("Xya");
    }
   public void eat(){
        System.out.println("hello i am cat andi eat fish");
    }
    public void play(){
        System.out.println("I love to play with ball");
    }

}

public class Extendsinterface {
    static void main() {
        Cat c1=new Cat();
        c1.breathe();
        c1.eat();
        c1.play();

    }
}
