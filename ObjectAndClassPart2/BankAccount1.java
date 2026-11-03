package ObjectAndClassPart2;

import java.util.Scanner;

class BankAccount1 {

    long accountNumber;
    String holderName;
    double balance;

    Scanner sc = new Scanner(System.in);

    void input() {

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        holderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    void withdraw() {

        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    void display() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Available Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount1 b1 = new BankAccount1();

        b1.input();
        b1.deposit();
        b1.withdraw();
        b1.display();
    }
}