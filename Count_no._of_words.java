import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                c++;
            }
        }
        System.out.println(c+1);
    }
}