import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char k=s.next().charAt(0);
        
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==k){
                c++;
            }
        }
        if(c!=0)
            System.out.println(c);
        else
            System.out.println("-1");
    }
}