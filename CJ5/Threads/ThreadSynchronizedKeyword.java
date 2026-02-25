package CJ5.Threads;

class Counter{
    int counter;
    public synchronized void increment(){ //synchronized means that one threads run ata time  ie. if t1 is working then t2 have to wait and vice versa ...if we dont use synchronized then method or object counter is not thread safe
        counter++;
    }

}

public class ThreadSynchronizedKeyword {
    static void main() throws Exception{


        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 500; i++) {
                c.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1500; i++) {
                c.increment();
            }
        });



        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.counter);

    }
}
