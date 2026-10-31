/*public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is even."); // it is print the values static reprasentation
        } else {
            System.out.println(number + " is odd.");
        }
    }
    
}   */
/*import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is even."); // using if else conditional statement Dynamic reprasentation

        } else {
            System.out.println(number + " is odd.");
        }
        
        scanner.close();
    }
}   */
import java.util.Scanner;
class EvenOrOdd
{
    public static void  main(String[] args){
        Scanner hi =new Scanner(System.in);
        System.out.println("Enter a number   :");
        int n= hi.nextInt();
        System.out.println( n%2==0 ? "It is Even number" : "It is Odd number"); //using conditional operator prit the valuse directly //
    }

}