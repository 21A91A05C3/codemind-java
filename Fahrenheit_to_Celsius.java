import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        float x=(n-32)*5/(float)9 ;
        System.out.printf("%.2f",x);
    }
}