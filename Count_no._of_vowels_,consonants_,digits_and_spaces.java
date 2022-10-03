import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int c=0,d=0,e=0,f=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                c++;
            }
            else if(str.charAt(i)==' '){
                d++;
            }
            else if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                e++;
            }
            else{
                f++;
            }
        }
        System.out.println("Vowels: "+e);
        System.out.println("Consonants: "+f);
        System.out.println("Digits: "+c);
        System.out.println("White spaces: "+d);
    }
}