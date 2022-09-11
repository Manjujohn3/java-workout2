import java.util.Scanner;
class swapval1{
    int a,b;

    swapval1(){}
swapval1(int i,int j)
{
    a=i;
    b=j;
}
void swap(int a, int b)
{
    System.out.println("Before swapping: a = " +a+ " and b = "+b);
    int c = a;
    a =b;
    b=c;
    System.out.println("After swapping: a = " +a+ " and b = "+b);
}

void swapref(swapval1 val)
{
    System.out.println("Before swapping: a = " +a+ " and b = "+b);
    int c;
    c=val.a;
    val.a=val.b;
    val.b=c;
    System.out.println("After swapping: a = " +val.a+ " and b = "+val.b);
}

public static void main(String args[])
{
    swapval1 sw1 = new swapval1();
    sw1.swap(30,40);
    swapval1 sw2 = new swapval1(4,6);
    sw2.swapref(sw2);
}

}