import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        char[] c=st.toCharArray();
        int su=0;
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){
                su+=Character.getNumericValue(c[i]);
            }
        }
        System.out.print(su);
    }
}