package CJ6.Exceptions;

public class MultipleExceptionHandlngException {
    static void main() {
        try{
            int arr1[]={20,04,60,80,96};
            int arr2[]={3,5,0,3,2};
            arr1[7]=7;
            String name = null;
            System.out.println(name.length());
            int [] result=new int[5];
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j< arr2.length;j++){
                    result[i]=arr1[i]/arr2[j];
                }
            }

        }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
            System.out.println(e);
        }
        System.out.println("hello");
    }
}
