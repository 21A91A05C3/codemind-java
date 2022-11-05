import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int max=0;
        for(int i=0;i<st.length();i++){
            int n=st.charAt(i);
            if(n>max){
                max=n;
            }
        }
        System.out.print((char)max);
    }
}