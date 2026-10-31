import java.util.Scanner;

public class ATMif_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the account balance :");
        double balance=sc.nextInt();
        System.out.print("Enter the Withdrawal Amount :");
        double ammount=sc.nextInt();
        if(ammount<=balance){
            System.out.println("Withdrawal is successful");
            System.out.println("Remaining balance  :"+(balance-ammount));
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    
}
