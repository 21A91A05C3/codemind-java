import java.util.*;
class Main{
    static boolean self(int n){
        int x=n,c=0,d=0;
        while(x!=0){
            int z=x%10;
            if(z==0)return false;
            if(n%z==0)c++;
            x/=10;
            d++;
        }
        if(c==d)return true;
        else return false;
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int  a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
            if(self(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}