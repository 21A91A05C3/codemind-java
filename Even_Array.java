import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        // int a=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(l[i]%2==0){
                c++;
            }
        }
        if(c==n){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        
    }
}