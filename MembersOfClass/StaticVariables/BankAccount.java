package MembersOfClass.StaticVariables;
import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    static String BankName="SBI";

    void display(){
        System.out.println("Account Holder :"+accountHolder);
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Banck Name :"+BankName);
        System.out.println("----------------");
    }
    
}
 class Bank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        BankAccount b1= new BankAccount();

        System.out.println("Enter the Account Holder 1:");
        b1.accountHolder=sc.next();
        System.out.println("Enter the Account Number 1:");
        b1.accountNumber=sc.nextLong();
        
        BankAccount b2=new BankAccount();
        System.out.println("Enter the Account Holder 2:");
        b2.accountHolder=sc.next();
        System.out.println("Enter the Account Number 2:");
        b2.accountNumber=sc.nextLong();

        BankAccount b3=new BankAccount();

         System.out.println("Enter the Account Holder 3:");
        b3.accountHolder=sc.next();
        System.out.println("Enter the Account Number 3:");
        b3.accountNumber=sc.nextLong();

b1.display();
b2.display();
b3.display();

      sc.close();  
    }

    
}
