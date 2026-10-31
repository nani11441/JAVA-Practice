public class ObjectAndClass {
    


    // Instance variables
    String location;
    int machineId;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Method to check balance
    void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }

    // Method to display ATM details
    void displayDetails() {
        System.out.println("ATM Location: " + location);
        System.out.println("Machine ID: " + machineId);
    }

    public static void main(String[] args) {

        // Creating first object
         ObjectAndClass atm1 = new  ObjectAndClass();

        atm1.location = "Hyderabad";
        atm1.machineId = 101;
        atm1.balance = 10000;

        System.out.println("----- ATM 1 DETAILS -----");

        atm1.displayDetails();
        atm1.checkBalance();

        atm1.deposit(5000);
        atm1.withdraw(2000);
        atm1.checkBalance();


        // Creating second object
        
        ObjectAndClass atm2 = new ObjectAndClass();

        atm2.location = "Bangalore";
        atm2.machineId = 102;
        atm2.balance = 20000;

        System.out.println("\n----- ATM 2 DETAILS -----");

        atm2.displayDetails();
        atm2.checkBalance();

        atm2.withdraw(5000);
        atm2.deposit(3000);
        atm2.checkBalance();
    }
}

    

