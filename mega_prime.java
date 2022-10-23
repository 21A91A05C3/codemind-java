import java.util.*;
import java.lang.Math;
class Main{
    public static int prime(int n){
        if(n<2)return 0;
        for(int i=2;i<(n/2)+1;i++)
        {
            if(n%i==0)return 0;
        }
        return 1;
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=0,i=0;
        if(prime(a)==1){
            while(a!=0){
                int d=a%10;
                if(prime(d)==1){
                    c++;
                }
                a/=10;
                i++;
            }
            if(c==i){
                System.out.print("Mega Prime");
            }
            else{
                System.out.print("Not Mega Prime");
            }
        }
        else{
            System.out.print("Not Mega Prime");
        }
    }
}