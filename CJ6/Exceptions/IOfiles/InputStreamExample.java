package CJ6.Exceptions.IOfiles;

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) throws Exception {

        InputStream input = new FileInputStream("C:\\Users\\sharmistha.k\\Desktop\\Coding\\IOfiles\\data");

        int data;

        while((data = input.read()) != -1) {
            System.out.print((char)data);
        }

        input.close();
    }
}
