import java.util.*;
class Main{
    static int rev(int n){
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        return r;
    }
    static boolean palin(int n){
        return rev(n)==n;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        n+=rev(n);
        while(!palin(n)){
            n+=rev(n);
        }
        System.out.print(n);
    }
}