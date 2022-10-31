import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=n;
        int su=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                su+=i;
            }
        }
        if(su>l) System.out.print("True");
        else System.out.print("False");
    }
}