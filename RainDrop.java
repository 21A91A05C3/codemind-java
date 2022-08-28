import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if (n%3==0 && n%5==0)
        {
            System.out.print("PlingPlang");
        }
        else if (n%5==0 && n%7==0)
        {
            System.out.print("PlangPlong");
        }
        else if (n%3==0 && n%7==0)
        {
            System.out.print("PlingPlong");
        }
        else if (n%3==0)
        {
            System.out.print("Pling");
        }
         else if (n%5==0)
        {
            System.out.print("Plang");
        }
         else if (n%7==0)
        {
            System.out.print("Plong");
        }
        else
        {
            System.out.print(n);
        }
        
    }
}