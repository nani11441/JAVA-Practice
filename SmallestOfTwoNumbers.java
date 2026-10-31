/*public class SmallestOfTwoNumbers {

    public static void main(String[] args) {
        int a=10;
        int b=20;                                         // Static programm to store the values in programm
        if(a<b){
            System.out.println(a+" is the smallest number");
        }else{
            System.out.println(b+" is the smallest number");
        }
    }
    
}
*/
/*import java.util.Scanner;
class SmallestOfTwoNumbers{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the second number :");    // Dynamic programm to taken for the values from user
        int b=sc.nextInt();
        if(a<b){
            System.out.println(a+" is the smallest number");
        }else{
            System.out.println(b+" is the smallest number");
        }
    }

}
    */
import java.util.Scanner;
/**
 * SmallestOfTwoNumbers
 */
public class SmallestOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");       //It is print the condition without using if else condition
        int n= sc.nextInt();
        System.out.println("Enter the m value:");
        int m=sc.nextInt();
        System.out.println(n>m&& n<m ? "N is big  :":"M is big:");
    }
}

