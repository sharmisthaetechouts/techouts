package CJ6.Exceptions.IOfiles;


import java.nio.file.*;
import java.io.IOException;

public class NIOExample {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\sharmistha.k\\Desktop\\Coding\\IOfiles\\niofile");
        String text = "Hello from NIO";

        try {
            Files.write(path, text.getBytes());

            String content = new String(Files.readAllBytes(path));

            System.out.println(content);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
