import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        double x=0;
        double i;
        for(i=1;i<=a;i++)
        {
            x=x+(1/i);
        }
        System.out.printf("%.2f",x);
    }
}