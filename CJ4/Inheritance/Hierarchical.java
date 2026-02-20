package CJ4.Inheritance;

public class Hierarchical {
    public static class Vehicle{
        String brand;
        int speed;

        Vehicle(String brand,int speed){
            this.brand=brand;
            this.speed=speed;
        }
        void displayVehicleInfo(){

        }
    }
    static class Car extends Vehicle{
        int noofdoors;

        Car(String brand,int speed,int noofdoors){
            super(brand,speed);
            this.noofdoors=noofdoors;
        }
        void displayCarInfo(){
            System.out.println("brand is" + brand + " speed is " +speed + " no of doors are " +noofdoors);
        }
    }
    static class Bike extends Vehicle{
        String model;
        Bike(String brand,int speed, String model){
            super(brand, speed);
            this.model=model;
        }

        void displayBikeInfo(){ 
            System.out.println("The bike model is" +model);
        }
    }
    public static void main(String[] args) {
        Bike b= new Bike("ZSE",2000,"HYGf");
        b.displayBikeInfo();

        Car c= new Car("Jhkhd", 0, 0);
        c.displayCarInfo();
    }
    
}
 