import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i=0;
        while(i<a){
            int n=s.nextInt();
            int l=n;
            int rev=0;
            while(n!=0){
                int d=n%10;
                rev=rev*10+d;
                n/=10;
            }
            if(l==rev){
                System.out.print("True"+"
");
            }
            else{
                System.out.print("False"+"
");
            }
            i+=1;
        }
    }
}