import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0;
        int []l=new int[a];
        for(int i=0;i<a;i++)
        {
            l[i]=s.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(l[i]%b!=0)
            {
                c++;
            }
            // System.out.print(l[i]+"	");
        }
        System.out.print(c);
    }
}