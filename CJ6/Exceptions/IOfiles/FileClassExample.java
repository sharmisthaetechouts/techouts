package CJ6.Exceptions.IOfiles;
import java.io.File;

public class FileClassExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sharmistha.k\\Desktop\\Coding\\IOfiles\\example");

        if(file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size: " + file.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
