import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,c,k;
        a=sc.nextInt();
        c=sc.nextInt();
        if (a%2==0 && (a>0||c%2==0))
        {
           System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
       
    }
}