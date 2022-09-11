import java.util.Scanner;
class Main{
    static boolean palin(int n){
        int d=0,rev=0,temp;
        temp=n;
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean prime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=a+1;i<a*a;i++){
            if(prime(i) && palin(i)){
                System.out.print(i);
                break;
            }
        }
    }
}