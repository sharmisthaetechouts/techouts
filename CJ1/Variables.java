package CJ1;

public class Variables {

    public static class Employee{
        String name;
        int age; //These two are instance variable.. ->stored in heap memory

        static String officename="ABC"; // make sure whenever we have a varaiable static the value for all remains same  -> will be stored in class method area

        Employee(String name,int age){
            String location="Jamshedpur"; //local variables -> we cannot have default values -> cannot have any access modifiers // cannot be accessed out side the class -> stored in Stack memory
            this.name=name;
            this.age=age;
            System.out.println(location);
        }
        void display(){
            System.out.println("The name of the employee is "+ name + " and age is : " + age );
        }
    }
    public static void main(String[] args) {
        Employee e1= new Employee("ZCV", 31);
        e1.display();
        System.out.println(Employee.officename);

        //even static variable can be change
        Employee.officename="FGH";
         System.out.println(Employee.officename);

        
    }
    
}
