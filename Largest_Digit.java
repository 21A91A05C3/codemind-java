import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int d,rev=0;
        while(n>0){
            d=n%10;
            if(d>rev){
                rev=d;
            }
            n/=10;
        }
        System.out.print(rev);
    }
    
}