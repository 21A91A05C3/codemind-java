import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int d=(int)Math.sqrt(n);
        if(d*d==n){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}