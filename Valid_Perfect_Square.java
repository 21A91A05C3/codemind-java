import java.util.*;
import java.lang.Math;

class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i=0;
        while(i<a){
            int n=s.nextInt();
            if(n==(int)Math.sqrt(n)*(int)Math.sqrt(n)){
                System.out.print("True"+"
");
            }
            else{
                System.out.print("False"+"
");
            }
            i+=1;
        }
        
    }
}