import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        double a,b,c,s,d,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        s=(a+b)/2;
        System.out.format("%.4f",s);
    }
}