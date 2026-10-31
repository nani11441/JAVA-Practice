import java.util.Scanner;

public class ATMBALANCEINwhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the account balance Ammount :");
        double balance=sc.nextInt();
        System.out.print("Enter the Withdrawal Amount:");
        double withdraw=sc.nextInt();
        while (withdraw<=balance) {
            System.out.println("Withdrawal is succesfull");
            System.out.print("Remaining balance :" +(balance-withdraw));
        }if(withdraw<=0){
            System.out.println("It is not recvierd amount: ");
        }else{
            System.out.println(" It is invalid:");
            
        }
            
    
       
    }
    
}
