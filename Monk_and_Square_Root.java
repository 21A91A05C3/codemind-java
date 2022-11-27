import java.util.*;
class S
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=0,d=0;
            for(int j=0;j<b;j++){
                long k=(long)j*j;
                if(k%b==a){
                    System.out.print(j+"
");
                    c=1;
                    break;
                }
            }
            if(c==0) System.out.print(-1+"
");
        }
        
    }
}