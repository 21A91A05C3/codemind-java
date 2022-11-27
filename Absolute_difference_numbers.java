import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int z=n;
        int m=s.nextInt();
        int p=(int)Math.pow(10,m);
        int x=z%p;
        // System.out.print(x+" "+p);
        while(n>=p) n/=10;
        // System.out.print(n);
        System.out.print(Math.abs(n-x));
    }
}