import java.util.*;
import java.lang.Math;

class Main{
    public static int fact(int n){
        if(n<=1)return 1;
        return n*(fact(n-1));
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int l=a;
        int x=0;
        while(a!=0){
            int d=a%10;
            x+=fact(d);
            a/=10;
        }
        if(x==l){
            System.out.print("The number " + l + " is a strong number");
        }
        else{
            System.out.print("The number "+ l +" is not a strong number");
        }
    }
}