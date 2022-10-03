import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int c=0,k;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                 c++;
            }
        }
        if(c!=0)
            System.out.print("Contains "+c+" digit");
        else{
            System.out.println("Doesn't contain digit");
        }
    }
}