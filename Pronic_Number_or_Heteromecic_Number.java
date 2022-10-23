import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        // int l=a;
        int x=0;
        int z=0;
        for(int i=1;i<a/2;i++){
            if(i*(i+1)!=a){
                continue;
            }
            else{
                x=1;
            }
        }
        if(x==1){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}