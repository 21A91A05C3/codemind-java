import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int c=1;
        int []b=new int[n];
        for(int i=0;i<n;i++){
            c=1;
            for(int j=0;j<n;j++){
                if(a[i]!=a[j]){
                    c*=a[j];
                }
            }
            b[i]=c;
        }
        for(int i=0;i<n;i++){
           System.out.print(b[i]+" ");
        }
    }
}