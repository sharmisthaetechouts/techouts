public class ParameterizedConstructors {
    public static class Student{
        int rollno;
        String name;
        public Student(int rollno, String name){
            this.rollno=rollno;
            this.name=name;
        }
        public void display(){
            System.out.println("The name of the student is " +name + " and roll no is :" +rollno );
        }
    }
        public static void main(String[] args){
            Student std1Student=new Student(01,"Sharmistha Karmakar");
            Student std2Student=new Student(2,"Sanny Karmakar");
           std1Student.display();
           std2Student.display();
        
    }
}
