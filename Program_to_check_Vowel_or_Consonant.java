import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      char n=s.next().charAt(0);
        if(n=='A'||n=='a')
        {
            System.out.print("Vowel");
        }
        else if(n=='I'||n=='i')
        {
           System.out.print("Vowel"); 
        }
        else if(n=='E'||n=='e')
        {
           System.out.print("Vowel"); 
        }
        else if(n=='O'||n=='o')
        {
           System.out.print("Vowel"); 
        }
        else if(n=='E'||n=='e')
        {
           System.out.print("Vowel"); 
        }
        else
        {
            System.out.print("Consonant");
        }
      
    }
}