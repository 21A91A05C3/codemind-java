import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []l=new int[n];
        for(int i=0;i<l.length;i++){
            l[i]=s.nextInt();
        }
        int c=0;
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=0;i<l.length;i++){
            if(l[i]>=a && l[i]<=b){
                c+=l[i];
            }
        }
        System.out.print(c);
    }
    
}