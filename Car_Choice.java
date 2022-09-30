import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner t = new Scanner(System.in);
        int n=t.nextInt();
        for(int i=0;i<n;i++){
             int a=t.nextInt();
             int b=t.nextInt();
             int c=t.nextInt();
             int d=t.nextInt();
             float x=c/(float)a;
             float y=d/(float)b;
             if(x<y){
                 System.out.println("-1");
             }
             else if (x==y){
                 System.out.println("0");
             }
             else{
                 System.out.println("1");
             }
        }
    }
}