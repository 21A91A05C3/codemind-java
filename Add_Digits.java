import java.util.*;
class Main{
    public static int ad(int n){
        int c=0;
        while(n!=0){
            int d=n%10;
            c+=d;
            n/=10;
        }
        if(c>=0 && c<=9){
            return c;
        }
        return ad(c);
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(ad(n));
    }
}