package CJ6.Exceptions.IOfiles;

import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) throws Exception {

        FileInputStream input = new FileInputStream("C:\\Users\\sharmistha.k\\Desktop\\Coding\\IOfiles\\input");
        FileOutputStream output = new FileOutputStream("C:\\Users\\sharmistha.k\\Desktop\\Coding\\IOfiles\\output");

        int i;

        while((i = input.read()) != -1) {
            output.write(i);
        }

        input.close();
        output.close();

        System.out.println("File copied successfully.");
    }
}
