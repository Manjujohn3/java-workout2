import java.util.Scanner;
class employee
{
    double total;
    public void result(double m1, double m2, double m3)
    {
       if(m1>=75 && m2>=75 && m3>=75)
        System.out.println("promoted");
        else
        System.out.println("Demoted");
    }
    public void average(double m1, double m2, double m3)
    {
        total = m1+m2+m3;
        System.out.println("total is: "+total);
        double avg = total/3;
        System.out.println("average is: "+avg);

    }
   public static void main(String args[]) 
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the name and id: ");
  String name = sc.nextLine();
  int id = sc.nextInt();
  System.out.println("enter the three marks: ");
  double num1 = sc.nextDouble();
  double num2 = sc.nextDouble();
  double num3 = sc.nextDouble();

  employee ob = new employee();
  ob.result(num1, num2, num3);
  ob.average(num1, num2, num3);
  } 
  }