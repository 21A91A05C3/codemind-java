import java.util.*;
class Main{
    public static boolean palin(int n){
        int x=n,rev=0,d;
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int []l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(palin(l[i])){
                c++;
            }
        }
        System.out.print(c);
    }
}