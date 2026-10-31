import java.util.Scanner; 
public class ATMPINvarificationIF_ELSE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int correctPIN= 11441;
        System.out.println("Enter the ATM PIN :");
        int PIN=sc.nextInt();
        if(PIN== correctPIN){
            System.out.println("PIN varified");
            System.out.println("You can access your Account");
        }
        else{
            System.out.println("Incorrect PIN");
            System.out.println("Again enter the valied PIN");
        }
    }
    
}
