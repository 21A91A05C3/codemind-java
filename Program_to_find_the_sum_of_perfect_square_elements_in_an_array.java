import java.util.Scanner;
import java.lang.Math;
class Main
{
    static boolean sq(int n)
    {
        double d;
        d=(int)Math.sqrt(n);
        if(d*d==n)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum=0;
         for(int i=0;i<n;i++)
        {
           if(sq(a[i]))
           {
               sum=sum+a[i];
           }
        }
        System.out.print(sum);
    }
}