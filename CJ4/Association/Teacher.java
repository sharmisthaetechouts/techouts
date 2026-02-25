package CJ4.Association;

public class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

    class Student{
        String nameofstudent;

        Student(String nameofstudent) {

            this.nameofstudent = nameofstudent;
        }

        void message(Teacher t) {  //we can pass the teacher object as a parameter ie student uses teacher object
            System.out.println(" The name of the student is " + nameofstudent + " and is taught by " + t.name);
        }
    }

    class associationtest{
        public static void main() {
            Teacher t1=new Teacher("ancx");
            Student s1=new Student("hgyt");
            s1.message(t1);



        }
    }

