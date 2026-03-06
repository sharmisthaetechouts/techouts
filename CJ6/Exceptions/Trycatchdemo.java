package CJ6.Exceptions;

public class Trycatchdemo {
    static void main() {
        try{
            int a=10;int b=0;
            int result=a/b;
        }catch(Exception e){  //exception here is a parent class so it can handle any type of exception but here the problem is that different types of exception can be known and resolved so the best practise is that we should use catch() and make sure to call that type of exception only in the catch block ie. catch(NullPointerException e)
            System.out.println(e);
            System.out.println(e.getMessage()); //Returns the detail message string of this throwable
        }
        System.out.println("Good Morning");

    }

}
