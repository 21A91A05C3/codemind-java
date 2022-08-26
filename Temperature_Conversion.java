import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a;
        double b,c,s,d,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=32+(a*1.8);
        // s=Math.round(b*100)/100.0;
        System.out.format("%.2f", b);
    }
}