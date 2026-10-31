import java.util.Scanner;


public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2;
            System.out.println("It is Low consumtion:");
        } else if (units <= 200) {
            bill = 100 * 2 + (units - 100) * 3;
            System.out.println("It is Mediam consumtion:");
        } else {
            bill = 100 * 2 + 100 * 3 + (units - 200) * 5;
            System.out.println("It is High concumtion:");
        }

        System.out.println("Electricity Bill = " + bill);

        sc.close();
    }
}