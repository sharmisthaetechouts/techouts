package CJ7;
import java.util.*;

class Student{
    String name;
    int rollno;

    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

}
public class LinkedListDemo {
    static void main() {
        LinkedList <Student>ll=new LinkedList<Student>();
        Student std1=new Student("avb",8);
        Student std2=new Student("avb",8);
        Student std3=new Student("avb",8);
        ll.add(std1);
        ll.add(std2);
        ll.add(std3);
        for(Student s:ll){
            System.out.println("The name of the student is : "+s.name +" and rollno is : " +s.rollno);
        }

    }
}
