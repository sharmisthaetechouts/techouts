package CJ2;
public class DataTypesDemo {
  public static void main(String[] args) {
     //primitive datatype
    byte a=-111;  //range from -128 to 127
    int b=908765; //(-2^31 to 2^31 -1) 4bytes
    int c; // to get the default value
    String str1="cvbnm";
    String str;  // to get the default value
    float d=7.0f;
    float e;  // to get the default value
    double f=90.87;
    double g; // to get the default value
    long h=80864;
    long i; // to get the default value 8 bytes ie very large numbers
    char ch1='A';  //char stores characters  not numbers
    char ch2;  // to get the default value ->To see the numeric value we need to do casting.
    short j=98;  //2 bytes, small numbers (-32,768 to 32,767)
    short k;

    System.out.println(a);
    System.out.println(b);
    //System.out.println(c);
    System.out.println(str1);
    System.out.println(d);
    //System.out.println(e);
    System.out.println(f);
     //System.out.println(g);
      System.out.println(h);
       //System.out.println(i);
        System.out.println(j);
         System.out.println(ch1);
          //System.out.println(ch2);

          //note:local variables (inside a method, like main) do NOT have default values.
          //to test local variable we need a constructor


  }  
    
    







    
}
