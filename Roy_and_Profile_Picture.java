import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        // System.out.print(l+"
");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            // System.out.print(x+"
");
            // System.out.print(y+"
");
            if(x<l || y<l){
              System.out.print("UPLOAD ANOTHER"+"
");  
            }
            else if(x==y || y==x){
                System.out.print("ACCEPTED"+"
");
            }
            else{
                System.out.print("CROP IT"+"
");
            }
        }
        
        
    }
}