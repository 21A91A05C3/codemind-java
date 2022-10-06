import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []l=new int[n];
        int []k=new int[n];
        for(int i=0;i<l.length;i++){
            l[i]=s.nextInt();
        }
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0;
        for(int i=0;i<l.length;i++){
            if(l[i]>=a && l[i]<=b){
                k[i]=l[i];
            }
        }
        int max=0;
        for(int i=0;i<k.length;i++){
            if(k[i]>max){
                max=k[i];
                c++;
            }
        }
        if(c==0){
            System.out.print("-1");
        }
        else{
            System.out.print(max);
        }
    }
}