import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=n*n;
        int d,x=0;
        while(n>0){
            d=n%10;
            x=x*10+d;
            n/=10;
        }
        int y,z=0;
        int l=x*x;
        while(l>0){
            y=l%10;
            z=z*10+y;
            l/=10;
        }
        if(z==k){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}