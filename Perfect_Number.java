import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int l=n;
        for(int i=1;i<n;i++){
            if(n%i==0) c+=i;
        }
        if(c==l) System.out.print("True");
        else System.out.print("False");
    }
}