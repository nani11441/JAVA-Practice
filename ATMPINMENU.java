
import java.util.Scanner;

class AdvancedATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 20000;

        int attempts = 0;
        boolean login = false;

        while (attempts < 3) {

            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                login = true;
                break;
            } else {
                attempts++;
                System.out.println("Wrong PIN");
                System.out.println("Attempts left = " + (3 - attempts));
            }
        }

        if (!login) {
            System.out.println("Please Try After Some Time !");
            return;
        }

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful");
                        System.out.println("Balance = " + balance);
                    } else {
                        System.out.println("Invalid amount");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful");
                    System.out.println("Remaining Balance = " + balance);
                    }
                    break;

                case 4:
                    System.out.print("Enter old PIN: ");
                    int oldPin = sc.nextInt();

                    if (oldPin == pin) {
                        System.out.print("Enter new PIN: ");
                        pin = sc.nextInt();
                        System.out.println("PIN changed successfully");
                    } else {
                        System.out.println("Incorrect old PIN");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}
    

