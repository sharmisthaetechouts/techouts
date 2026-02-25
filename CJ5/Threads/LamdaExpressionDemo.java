

public class LamdaExpressionDemo {
    static void main() {
       // Hello obj1 =new Hello();

//        Runnable obj1=()->
//        {
//
//                for(int i=1;i<=5;i++) {
//                    System.out.println(" Hello");
//                    try{
//                        Thread.sleep(1000);
//                    }catch(Exception e){};
//                }
//
//        };
//        Runnable obj2 = () ->
//        {
//
//                for(int i=1;i<=5;i++) {
//                    System.out.println(" Hi");
//                    try{
//                        Thread.sleep(1000);
//                    }catch(Exception e){};
//
//            }
//        };


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
                System.out.println(" Hello");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){};
            }

        });
        t1.start(); //runs method of our class
        try{
            Thread.sleep(500); // this makes sure that there should not be clash between 2 threads
        }catch(Exception e){};
        t2.start();



    }
}
