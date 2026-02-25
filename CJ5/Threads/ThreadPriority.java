package CJ5.Threads;

public class ThreadPriority {
    static void main() throws Exception {


        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello"+Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
                ;
            }
        });

        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("World"+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
                ;
            }
        }, "2nd Thread");
        t1.setPriority(1); //least priority
        t2.setPriority(10);//highest priority

        //or we can also setPriority by MIN_priority
         t1.setPriority(Thread.MIN_PRIORITY);//public static final int MIN_PRIORITY = 1 The minimum priority that a thread can have.
         t1.setPriority(Thread.MAX_PRIORITY); //public static final int MAX_PRIORITY = 10 The maximum priority that a thread can have.
        System.out.println(t1.getPriority()); //by default we have priority from 1-10 and default value is 5
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
//        System.out.println(t1.getName()); //default thread name is Thread 0
        //now we can set the name of thread as well
        t1.setName("First Thread");

        System.out.println(t1.getName()); //first method to set the thread name is this setName() and second method is like when we are creating obj of runnable
        System.out.println(t2.getName());
        t1.isInterrupted();

        t1.join();
        t2.join();
    }
}