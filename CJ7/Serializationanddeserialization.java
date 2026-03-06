package CJ7;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Serializationanddeserialization {
    static void main() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        //performing serialization

        try{
            FileOutputStream fos=new FileOutputStream("file");
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();

            //performing Dserialization
            FileInputStream fis=new FileInputStream("file");
            ObjectInputStream ois=new ObjectInputStream(fis);

            // Read the ArrayList object from the file and cast it to ArrayList<String>

            ArrayList list=(ArrayList)ois.readObject();
            System.out.println(list);
            fis.close();
            ois.close();


        }catch(Exception e){
            System.out.println(e);
        };
    }
}
