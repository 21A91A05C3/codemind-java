import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int l=1;
        int x=0;
        while(a!=0){
            int d=a%10;
            x+=d;
            l*=d;
            a/=10;
        }
        if(x==l){
            System.out.print("Spy Number");
        }
        else{
            System.out.print("Not Spy Number");
        }
    }
}