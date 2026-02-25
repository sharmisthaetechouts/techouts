package CJ5.Interface;

 interface  Shape {

    void area();

    class Circle implements Shape{
        int radius;


        Circle(int radius){
            this.radius=radius;

        }

        public void area(){
            double pi=3.1444;
            double area_of_circle=0;
            area_of_circle=pi*radius*radius;
            System.out.println("The area of Circle is : "+area_of_circle);
        }


    }
    class Rectangle implements Shape{
        int a,b;

        Rectangle(int a,int b){
            this.a=a;
            this.b=b;

        }
        public void area(){
            double area_of_rectangle=0;
            area_of_rectangle=a*b;
            System.out.println("The area of Rectangle is : "+area_of_rectangle);
        }


    }

     static void main() {
         Circle c1=new Circle(4);
         Rectangle r1=new Rectangle(5,8);
         c1.area();
         r1.area();
     }

}

