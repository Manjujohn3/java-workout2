import java.util.Scanner;
class mathoperation
{
    double r;
    int x,y;
mathoperation()
{
}

void init()
{
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x value: ");
         x = sc.nextInt();
        System.out.println("enter the y value ");
         y = sc.nextInt();
}

void add()
{
    int r=x+y;
    System.out.println("The added value is " +r);
}

void multiply()
{
    int r=x*y;
    System.out.println("The product value is " +r);
}

void power()
{
    double r=Math.pow(x,y);
    System.out.println("The power is " +r);
}

void display()
{
    add();
    multiply();
    power();
}
}
class mathoperationd
{
    public static void main(String args[])
    {
        mathoperation ob=new mathoperation();
        ob.init();
        ob.display();
    }
    
}