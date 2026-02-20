package CJ4.Inheritance;

public class SingleInheritance {
    public static class Employee{
        String name ;
        double salary;

        Employee(String name, double salary){
            this.name=name;
            this.salary=salary;
        }
        void display(){
          System.out.println("The name is :" +name + "and Salary is:" +salary);
       }
    }
       static class Manager extends Employee{
           String department;
           Manager(String department,String name, double salary){
            super(name,salary);
            this.department=department;
           }
         
          void display(){
            System.out.println("The name is :" +name + "and Salary is:" + salary + "belongs to " +department + " department.");
            
          
       }

    }

    public static void main(String args[]){
       Employee e1=new Employee("Sanny Karmakar",8973405);
       e1.display();
       Manager m1=new Manager("IT","BOB",29029);
       m1.display();

    }
}
