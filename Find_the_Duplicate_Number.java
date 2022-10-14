import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []l=new int[n];
        for(int i=0;i<l.length;i++){
            l[i]=s.nextInt();
        }
        // float c=0,d=0;
        for(int i=0;i<l.length;i++){
            for(int j=i+1;j<l.length;j++){
                if(l[i]==l[j]){
                    System.out.print(l[i]);
                    break;
                }
            }
            
        }
      
    }
}