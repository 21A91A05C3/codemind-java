import java.util.Scanner;
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
        int x=s.nextInt();
        int y=0,d=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=x)
            {
                y++;
            }
            else
            {
                d=d+2;
            }
        }
        System.out.print((y+d));
    }
}