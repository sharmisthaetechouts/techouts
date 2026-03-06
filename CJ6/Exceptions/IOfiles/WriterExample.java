package CJ6.Exceptions.IOfiles;

import java.io.*;

public class WriterExample {
    public static void main(String[] args) throws Exception {

        Writer writer = new FileWriter("data.txt");

        writer.write("Java Writer Class Example");

        writer.close();

        System.out.println("Writing completed.");
    }
}
