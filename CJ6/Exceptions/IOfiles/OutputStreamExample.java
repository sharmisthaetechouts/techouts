package CJ6.Exceptions.IOfiles;

import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) throws Exception {

        OutputStream output = new FileOutputStream("C:\\Users\\sharmistha.k\\Desktop\\Coding\\IOfiles\\data");

        String text = "Hello Java";

        byte b[] = text.getBytes();

        output.write(b);

        output.close();

        System.out.println("Data written successfully.");
    }
}
