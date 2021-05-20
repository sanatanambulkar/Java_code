import java.lang.*;
import java .util.*;

class Arithmatic 
{
    int count (int iNo)
    {

     int idigit=0;
     int icnt=0;

     while(iNo !=0)
     {
         idigit=iNo % 10;

         if((idigit % 2)==0)
        {
            icnt++;
        }
        
        iNo=iNo/10;
     }
     return icnt;
    }
}

class Demo1
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("enter number");
        int value=sobj.nextInt();

        Arithmatic aobj=new Arithmatic ();
        int ret=0;
        ret =aobj.count(value);

        System.out.println("count of even digit is" + ret); 
    }
}