import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        int []c=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=s.nextInt();
        }
       
        for(int i=0;i<n;i++){
           System.out.print((a[i]+b[i])+" ");
        }
    }
}