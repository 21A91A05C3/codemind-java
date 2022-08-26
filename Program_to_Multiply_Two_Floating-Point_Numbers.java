import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        double a,b,c,s,d,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        s=a*b;
        // d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        e=Math.round(s*100)/100.0;
        System.out.print(e);
    }
}