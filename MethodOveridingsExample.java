import java.util.Scanner;
class Shape
{   
    public double calculateArea()
    { 
        System.out.println("Area of different Shape");
        return 0;
    }
   
}
class Circle extends Shape
{   double radius;
    Circle(Double radius)
    {
        this.radius=radius;
    }
    @Override
    public double  calculateArea()
    {  
        return (22/7)*radius*radius;
       
    }
   
}
class Rectangle extends Shape
{   double length,breath;
    Rectangle(double length,double breath){
        this.length=length;
        this.breath=breath;
    
    }
    @Override
    public double calculateArea()
    {
       
        return length*breath;
       
    }
   
}
class MethodOveridingsExample
{
        public static void main(String [] args)
        {   Scanner sc=new Scanner(System.in);
            Rectangle R=new Rectangle(23.5,77.5);
            Circle C=new Circle(34.5);
            R.calculateArea();
            System.out.println("Area of Rectangle="+R.calculateArea());
            C.calculateArea();
            System.out.println("Area of Circle="+C.calculateArea());
        

        }
}