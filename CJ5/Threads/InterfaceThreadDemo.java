package CJ5.Threads;

class Helloo implements Runnable{

    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println(" Hello");
            try{
                Thread.sleep(1000);
            }catch(Exception e){};
        }
    }
}
class Hii implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(1000);
            }catch(Exception e){};

        }
    }
}
public class InterfaceThreadDemo {
    static void main() {
        Helloo obj1 =new Helloo();
        Hii obj2 = new Hii();

        Thread t1=new Thread(obj1);  //Thread object
        Thread t2=new Thread(obj2);
        t1.start(); //runs method of our class
        try{
            Thread.sleep(500); // this makes sure that there should not be clash between 2 threads
        }catch(Exception e){};
        t2.start();
    }
}
