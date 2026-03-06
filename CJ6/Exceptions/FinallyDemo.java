package CJ6.Exceptions;

public class FinallyDemo {
    static void main() {
        try {
            int a[] = new int[5];
            a[8] = 8;
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
        }
            finally{
            System.out.println("The process ends here ");
            System.out.println(Thread.currentThread()); //Thread[main,5,main] main → Thread name 5 → Priority main → Thread group By default, every Java program starts with main thread.
            System.out.println(Thread.currentThread().getName());
        }
    }
}
