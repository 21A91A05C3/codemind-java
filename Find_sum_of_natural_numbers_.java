import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k;
      k=n*(n+1)/2;
      System.out.print(k);
    }
}