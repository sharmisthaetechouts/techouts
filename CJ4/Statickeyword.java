package CJ4;
public class Statickeyword {
    //static variable
    static String schoolname=" GHS";

    //static block
    static{
        System.out.println("Hellow static block");
    }

    //static method
      static void  Test(){
        System.out.println(" This is a static method");
    }
     public static void main(String[] args){
        Test();
        System.out.println("Main methid display");
     }
}
