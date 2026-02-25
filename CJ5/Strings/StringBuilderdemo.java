package CJ5.Strings;

public class StringBuilderdemo {

    static void main() {
        StringBuilder str1=new StringBuilder("Sharmistha");
        StringBuilder str2=new StringBuilder("Sharmistha");
        StringBuilder str=new StringBuilder();
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str1.append(" Karmakar"));

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.delete(1,4));
        System.out.println(str1.toString());
        System.out.println(str1.length());


    }
}
