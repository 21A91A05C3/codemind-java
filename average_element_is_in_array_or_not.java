import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int d=0;
        for(int i=0;i<n;i++){
            d+=a[i];
        }
        int k=d/n;
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                c=1;
            }
        }
        if(c==1){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}