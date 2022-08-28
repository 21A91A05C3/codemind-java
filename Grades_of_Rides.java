import  java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>50 && b>60 && c>100)
        {
            System.out.print("10");
        }
        else if(a>50 && b>60)
        {
             System.out.print("9");
        }
        else if(c>100 && b>60)
        {
             System.out.print("8");
        }
        else if(a>50 && c>100)
        {
             System.out.print("7");
        }
        else if(a>50 || b>60||c>100)
        {
             System.out.print("6");
        }
        else
        {
            System.out.print("5");
        }
    }
}