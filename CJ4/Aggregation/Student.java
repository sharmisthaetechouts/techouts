package CJ4.Aggregation;


public class Student {
     String stdname;

     Student(String stdname){
         this.stdname=stdname;
     }
}
class Department {
    String deptname;

    Student[] students;//aggregation :Department has students

    Department(String deptname, Student[] students) {
        this.deptname = deptname;
        this.students = students;
    }

    void showstd() {
        for (Student s : students) {
            System.out.println(s.stdname);
        }
    }


     static void main() {
         Student s1 = new Student("hgf");
         Student s2 = new Student("Gjgfds");
         Student s3 = new Student("ytrs");

         Student[] allstudent = {s1, s2, s3};
         Department dept = new Department("cs", allstudent);

         dept.showstd();


     }

 }


