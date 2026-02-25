package CJ5.Strings;

public class StringDemo {

    static void main() {
        String str1="Java";
        String str2="AVAJ";
        String str3="JAVA";
        String str4="Java";
        // The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.it follow lexographically.
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str2));

        System.out.println(str1.compareToIgnoreCase(str3)); //Compares two strings lexicographically, ignoring case differences.

        String s1= new String("Java");
        String s2=new String("Java");
        System.out.println(s1==s2);
        System.out.println(str1=str4);

        System.out.println(s1.endsWith("a"));
        System.out.println(str2.toLowerCase());
        System.out.println(s1.equals(s2));
        //Compares this string to the specified object. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.


        System.out.println(s1.charAt(2));//Returns the char value at the specified index.
        System.out.println(s1.replace('a','c')); //Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.

        System.out.println(s1.hashCode());
        System.out.println(s1.indexOf(3));//Returns the index within this string of the first occurrence of the specified character.
    }
}
