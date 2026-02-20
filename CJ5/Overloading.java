package CJ5;
 public class Overloading {
     public static class Calculate{
        static int  a,b;

         public static int add(int c,int d){
            a=c;
            b=d;
            return a+b;
         }

        
         public static double add(double f,double g){

             return f+g;
         }


     }
    public static void main(String[] args) {

        System.out.println(  Calculate.add(9,8));
        System.out.println(  Calculate.add(10.0,8.9));

        
    }
}
