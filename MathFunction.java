import java.util.Scanner;
class MathFunction
{
    float r;

    void multiply(int x,int y)
    {
        r=x*y;
        System.out.println("r= " +r);
    }

    void multiply(float x,float y)
    {
        r=x*y;
        System.out.println("r= " +r);
    }

    void multiply(int x,float y)
    {
        r=x*y;
        System.out.println("r= " +r);
    }
public static void main(String args[])
{
    MathFunction ob=new MathFunction();
    {
    ob.multiply(5,4);
    ob.multiply((float)2.8,(float)6.5);
    ob.multiply(7,(float)5.8);
}
}
}