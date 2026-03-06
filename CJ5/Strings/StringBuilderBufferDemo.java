package CJ5.Strings;

public class StringBuilderBufferDemo {
    public static void main(String[] args) {

        // STRING BUILDER

        StringBuilder sb = new StringBuilder("Hello");

        // append()
        sb.append(" World");
        System.out.println("append(): " + sb);

        // insert()
        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);

        // replace()
        sb.replace(6, 10, "Programming");
        System.out.println("replace(): " + sb);

        // delete()
        sb.delete(6, 18);
        System.out.println("delete(): " + sb);

        // reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);


        // length()
        System.out.println("length(): " + sb.length());

        // charAt()
        System.out.println("charAt(2): " + sb.charAt(2));

        // setCharAt()
        sb.setCharAt(2, 'X');
        System.out.println("setCharAt(): " + sb);




        //  STRING BUFFER
        System.out.println("\n----- StringBuffer Methods -----");

        StringBuffer sbf = new StringBuffer("Java");

        // append()
        sbf.append(" Programming");
        System.out.println("append(): " + sbf);

        // insert()
        sbf.insert(4, " Language");
        System.out.println("insert(): " + sbf);

        // replace()
        sbf.replace(5, 13, "Code");
        System.out.println("replace(): " + sbf);

        // delete()
        sbf.delete(5, 9);
        System.out.println("delete(): " + sbf);

        // reverse()
        sbf.reverse();
        System.out.println("reverse(): " + sbf);


        // length()
        System.out.println("length(): " + sbf.length());

        // charAt()
        System.out.println("charAt(3): " + sbf.charAt(3));

        // setCharAt()
        sbf.setCharAt(3, 'Z');
        System.out.println("setCharAt(): " + sbf);


    }
}
