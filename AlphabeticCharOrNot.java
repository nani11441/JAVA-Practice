/*public class AlphabeticCharOrNot {
    public static void main(String[] args) {
        char ch='a';
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch+" is an alphabetic character");
        }else{
            System.out.println(ch+" is not an alphabetic character");
        }
    }
    
}
    */
import java.util.Scanner;
public class AlphabeticCharOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch+" is an alphabetic character");
        }else{
            System.out.println(ch+" is not an alphabetic character");
        }
    }
    
}
