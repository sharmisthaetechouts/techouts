package CJ5.Strings;

public class StringCharacterDemo {
    public static void main(String[] args) {

        // STRING CLASS METHODS

        String str = "Java Programming";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 2: " + str.charAt(2));

        // substring()
        System.out.println("Substring (0,4): " + str.substring(0,4));

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // equals()
        String str2 = "Java Programming";
        System.out.println("Equals: " + str.equals(str2));  //Compares this string to the specified object. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.

        // equalsIgnoreCase()
        String str3 = "java programming";
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str3));  //Two strings are considered equal ignoring case if they are of the same length and corresponding Unicode code points in the two strings are equal ignoring case

        // compareTo()
        System.out.println("CompareTo: " + str.compareTo(str2));  //Compares two strings lexicographically.

        // contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // replace()
        System.out.println("Replace: " + str.replace("Java", "Python"));

        // indexOf()
        System.out.println("IndexOf 'P': " + str.indexOf('P'));

        // concat()
        System.out.println("Concat: " + str.concat(" Language"));



        // CHARACTER CLASS METHODS

        char ch = 'A';
        char ch2 = '5';

        // isLetter()
        System.out.println("IsLetter: " + Character.isLetter(ch));

        // isDigit()
        System.out.println("IsDigit: " + Character.isDigit(ch2));

        // isUpperCase()
        System.out.println("IsUpperCase: " + Character.isUpperCase(ch));

        // isLowerCase()
        System.out.println("IsLowerCase: " + Character.isLowerCase(ch));

        // toLowerCase()
        System.out.println("ToLowerCase: " + Character.toLowerCase(ch));

        // toUpperCase()
        System.out.println("ToUpperCase: " + Character.toUpperCase('b'));

    }
}
