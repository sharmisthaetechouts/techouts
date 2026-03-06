package CJ6.Exceptions;

public class PrintStackDemo {

    public static void method3() {
        int result = 10 / 0;  // causes ArithmeticException
    }

    public static void method2() {
        method3();
    }

    public static void method1() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();  // prints full stack trace
        }
    }
}