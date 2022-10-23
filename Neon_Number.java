import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int l=a;
        int x=a*a;
        int z=0;
        while(x!=0){
            int d=x%10;
            z+=d;
            x/=10;
        }
        if(z==l){
            System.out.print("Neon Number");
        }
        else{
            System.out.print("Not Neon Number");
        }
    }
}