import java.util.*;
import java.lang.Math;

class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int x=0,z=1;
        while(a!=0){
            int temp = a%10;
            x+=temp;
            z*=temp;
            a=a/10;
        }
        System.out.print(z-x);
    }
}