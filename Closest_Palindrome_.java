import java.util.*;
class Main{
    static boolean palin(int n){
        int r=0;
        int m=n;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }
        if(r==m) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=n-1,b=n+1;
        while(!palin(a)) a--;
        while(!palin(b)) b++;
        // System.out.print(b);
        if((n-a)<(b-n)) System.out.print(a+"
");
        else if ((n-a)>(b-n)) System.out.print(b+"
");
        else if((n-a)==(b-n))System.out.print(a+" "+b);
    }
}