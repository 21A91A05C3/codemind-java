import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=s.nextInt();
            int c=s.nextInt();
            int d=0;
            int f=0;
            for(int j=b;j<=c;j++)
            {
                f=j%10;
                if(f==2||f==3||f==9)
                {
                    d++;
                }
            }
            System.out.print(d);
            System.out.print("
");  
        }
    }
}