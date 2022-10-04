import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []l=new int[n];
        for(int i=0;i<l.length;i++){
            l[i]=s.nextInt();
        }
        int a=s.nextInt();
        int c=0;
        for(int i=0;i<l.length;i++){
            if(l[i]==a){
                c++;
            }
        }
        if(c!=0){
            System.out.print(c);
        }
        else{
            System.out.print("0");
        }
    }
    
}