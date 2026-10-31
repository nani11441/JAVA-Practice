/*import java.util.Scanner;

// the dynamic using if else


public class DivisibleBy2And3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= sc.nextInt();
        if(n%2==0 && n%3==0){
            System.out.println("It is divisibile by 2 and 3 :");   

        } else{
            System.out.println("It is Not divisible by 2 and 3 :");
        }
    }
    
}
*/
import java.util.Scanner;

// the dynamic without using ifelse statement ,the values print directly in printing statement
class DivisibleBy2And3{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value :");
         int n= sc.nextInt();
         System.out.println(n%2==0 && n%3==0 ? "It is divisibile by 2 and 3 :" : "It is Not divisible by 2 and 3 :");
        
    }
   
}
