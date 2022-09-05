import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum=0,d=0;
         for(int i=0;i<n;i++)
        {
           if(a[i]%2==0)
           {
               sum++;
           }
           else
           {
               d++;
           }
        }
        System.out.print(sum+" ");
        System.out.print(d);
        
    }
}