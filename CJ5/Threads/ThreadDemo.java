package CJ5.Threads;
class Hello extends Thread{

    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println(" Hello");
            try{
                Thread.sleep(1000);
            }catch(Exception e){};
        }
    }
}
class Hi extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(1000);
            }catch(Exception e){};

        }
    }
}
public class ThreadDemo {
    static void main() {
        Hello obj1 =new Hello();
        Hi obj2 = new Hi();

        obj1.start();
        try{
            Thread.sleep(500); // this makes sure that there should not be clash between 2 threads
        }catch(Exception e){};
        obj2.start();
    }
}

