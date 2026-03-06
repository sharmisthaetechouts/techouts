package CJ6.Exceptions.IOfiles;

import java.io.*;

public class ReaderExample {
    public static void main(String[] args) throws Exception {

        Reader reader = new FileReader("C:\\Users\\sharmistha.k\\Desktop\\Coding\\IOfiles\\data");

        int ch;

        while((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        reader.close();
    }
}
