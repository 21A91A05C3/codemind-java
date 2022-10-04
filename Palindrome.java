import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d,rev=0;
        int x=n;
        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(rev==x){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}