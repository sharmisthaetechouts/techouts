package CJ5.Interface;


interface Printable{
    void print();
}
interface Saveable{
    void save();
}
class Document implements Printable,Saveable{

    public void print(){
        System.out.println("Hello i am yr printer");
    }
    public void save(){
        System.out.println("Hello save mode on");
    }
}
public class MultipleInterface {
    static void main() {
        Document d1=new Document();
        d1.print();
        d1.save();
    }
}
