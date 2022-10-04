import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []l=new int[n];
        for(int i=0;i<l.length;i++){
            l[i]=s.nextInt();
        }
        float c=0,d=0;
        for(int i=0;i<l.length;i++){
            c+=l[i];
            d++;
        }
        System.out.printf("%.2f",c/d);
    }
    
}