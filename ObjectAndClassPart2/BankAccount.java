package ObjectAndClass;


class BankAccount {

    // Instance variables
    String accountHolder;
    long accountNumber;
    double balance;

    // Deposit method
    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdrawal method
    void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Balance checking method
    void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {

        // Creating object
        BankAccount b1 = new BankAccount();

        b1.accountHolder = "Nani";
        b1.accountNumber = 123456789;
        b1.balance = 10000;

        b1.displayDetails();

        b1.checkBalance();

        b1.deposit(5000);

        b1.withdraw(2000);

        b1.checkBalance();
    }
}

