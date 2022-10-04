import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        int c=0,d=0;
        
        for(int i=1;i<l.length;i++){
            if(l[i]<l[i-1]){//13 21
                d++;
            }
        }
        if(l.length==(d+1)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}