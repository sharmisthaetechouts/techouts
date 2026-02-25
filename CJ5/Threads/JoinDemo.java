package CJ5.Threads;

public class JoinDemo  {
    public static void main(String[] args) throws Exception{
        Thread t1=new Thread(()->
        {

            for(int i=1;i<=5;i++) {
                System.out.println(" Hello");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){};
            }

        });  //Thread object
        Thread t2=new Thread(()->
        {

            for(int i=1;i<=5;i++) {
                System.out.println(" World");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){};
            }

        });
        t1.start(); //runs method of our class
        //note:start() does NOT wait for the thread to finish
        //It only tells the JVM:
        //Hey scheduler, please run this thread sometime.
        //After calling start(), the main thread continues immediately to the next line.
        try{
            Thread.sleep(500); // this makes sure that there should not be clash between 2 threads
        }catch(Exception e){};

        System.out.println(t1.isAlive()); // The method isAlive() basically Tests if this thread is alive. A thread is alive if it has been started and has not yet terminated it returns: true if this thread is alive; false otherwise.

        //now to run the main thread we need join() so that the main thread should run at last
        //join:Waits for this thread to terminate
        //withou join the main thread can run any where in between the two threads due to schedulers
        t1.join(); // we need to add throws exception to avoid the error of join ie.Unhandled exception: java.lang.InterruptedException
        t2.join(); // why to throw that exception??? Ans: if any thread has interrupted the current thread. The interrupted status of the current thread is cleared when this exception is thrown.
        System.out.println(t1.isAlive()); // this will give false bec the threads get terminated here after join
        System.out.println("Bye");
    }
}
