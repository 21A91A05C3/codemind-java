import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double temp;
        temp=a;
        int i,j,c=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                if((Math.pow(i,2)+Math.pow(j,2))==temp)
                {
                    c++;
                }
            }
        }
        
        if(c==0)
        {
            System.out.print("False");
        }
        else
        {
           System.out.print("True"); 
        }
    }
}