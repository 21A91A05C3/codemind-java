import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[]a=new int[t];
        int[]ar=new int[t];
        for(int i=0;i<t;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<t;i++){
            ar[i]=(a[i]*a[i]);
        }
        Arrays.sort(ar);
        for(int x:ar){
            System.out.print(x+" ");
        }
        
    }
}