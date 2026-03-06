package CJ6.Exceptions.IOfiles;

import java.io.*;

public class CharacterStreamExample {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("C:\\Users\\sharmistha.k\\Desktop\\Coding\\IOfiles\\input");
        FileWriter fw = new FileWriter("C:\\Users\\sharmistha.k\\Desktop\\Coding\\IOfiles\\output");

        int ch;

        while((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        System.out.println("Character Stream Copy Done.");
    }
}
