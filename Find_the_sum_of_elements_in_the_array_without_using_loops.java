import java.util.Scanner;
class Main{
    public static void main(String agrs[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
    
        System.out.print(sum);
    }
}