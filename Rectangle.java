import java.util.Scanner;
class rectangle
{
    double length,breadth;

    rectangle(double x)
{
    length=x;
    breadth=x;
}
rectangle(double a,double b)
{
    length=a;
    breadth=b;
}
void getarea()
{
    double area=length*breadth;
    System.out.println("Area of rectangle is" +area);
}


    void getperimeter()
{
    double perimeter=2*(length+breadth);
    System.out.println("perimeter of rectangle is" +perimeter);
}

public static void main(String args[])
 {
   rectangle r1=new rectangle(5);
   rectangle r2=new rectangle(5,2);
   r1.getarea();
   r1.getperimeter();
   r2.getarea();
   r2.getperimeter();  
}

}
