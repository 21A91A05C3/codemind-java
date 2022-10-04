import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []l=new int[n];
        for(int i=0;i<l.length;i++){
            l[i]=s.nextInt();
        }
        int max=l[0];
        for(int i=1;i<l.length;i++){
            if(l[i]>max){
                max=l[i];
            }
        }
        System.out.print(max);
    }
    
}