import java.util.*;
class Main{
    public static int ad(int n){
        int c=0;
        while(n!=0){
            int d=n%10;
            c+=d*d;
            n/=10;
        }
        if(c>=0 && c<=9){
            if(c==1 || c==7)
            return 1;
            else
            return 0;
        }
        return ad(c);
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(ad(n)==1)
        System.out.print("True");
        else
        System.out.print("False");
    }
}