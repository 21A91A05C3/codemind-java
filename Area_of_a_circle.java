import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a,c;
        a=sc.nextDouble();
        c=3.14*a*a;
        double d=Math.round(c*100)/100.0;
        System.out.print(d);
        
    }
}