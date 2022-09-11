import java.util.Scanner;
class Main{
    static boolean palin(int n){
        int d,rev=0,temp;
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
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        int k=s.nextInt();
        for(int i=a;i<k;i++){
            if(palin(i)){
                System.out.print(i+" ");
            }
        }
    }
}