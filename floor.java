import java.util.*;
class tile
{
    int edge;
    int area;

    tile()
    {

    }
    tile(int edge)
    {
        this.edge=edge;
    }
    int area()
    {
        area=edge*edge;
        return area;
    }
}

class floor
{
    int length, width;
    floor()
    {

    }
    floor(int length, int width)
    {
        this.length=length;
        this.width=width;
    }
void totaltiles(tile t)
{
    double tilearea=t.area();
    double floorarea=length*width;
    double nooftiles=floorarea/tilearea;
    System.out.println("number of tiles :" +nooftiles);
}

public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
System.out.println("enter the edge of tile:");
int tileedge=sc.nextInt();
tile t= new tile(tileedge);

System.out.println("enter the length and width of floor:");
int len = sc.nextInt();
int wid = sc.nextInt();
floor f=new floor(len,wid);
f.totaltiles(t);
}


}