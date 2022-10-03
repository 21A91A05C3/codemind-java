import java.util.*;
class Main{
    public static int prime(int n){
        if(n<2){
            return 0;
        }
        int d=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                d++;
            }
        }
        if(d==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0;
        for(int i=a;i<=b;i++){
            if(prime(i)==1){
                c++;
            }
        }
        System.out.print(c);
    }
}