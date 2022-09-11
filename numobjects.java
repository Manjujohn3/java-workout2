import java.io.*;
import java.util.*;
class numobjects
{
    static int count;
    numobjects()
    {
        count+=1;
    }
    public static void main(String args[])
     {
        numobjects ob1=new  numobjects();
        numobjects ob2=new  numobjects();
        numobjects ob3=new  numobjects();
        numobjects ob4=new  numobjects();
        numobjects ob5=new  numobjects();
     numobjects ob6=new  numobjects();
     System.out.println("\n Number of object ="+count);   
    }
}