package CJ4.Inheritance;

public class Multilevel {   // grandparent <- parent <- child 
    
    public static class Person{

        String name;
        int age;

        Person(String name ,int age){
            this.name=name;
            this.age=age;
        }

        void displayinfo(){
            System.out.println( "The name of the person is :" +name + " and age is: " +age);
        }
    }
     static class Employee extends Person{
        int empId;
        double salary;

        Employee(int empId, double salary,String name,int age){
            super(name,age);
            this.empId=empId;
            this.salary=salary;
           
        }

        void displayempinfo(){
            System.out.println("The employeeId is" +empId + " and salary is:" +salary);
        }
    }
    static class Manager extends Employee{
        String department;

        Manager(String department, int empId,double salary,String name,int age){
            super(empId,salary,name,age);
            this.department=department;
            
        }

        void displayinfo(){
            System.out.println("The name of Manager is :" +name + " with empployeeId is "+ empId  +" age is :" +age + "belongs to :" +department + "department" + " salary is :" +salary  );
        }
    }
    public static void main(String[] args) {
        Manager m =new Manager("IT",1,21000,"Sharmistha",21);
        m.displayinfo();
        m.displayempinfo();
        
        



    }
}
