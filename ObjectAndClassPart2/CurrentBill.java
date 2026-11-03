package ObjectAndClassPart2;

import java.util.Scanner;

class CurrentBill {

    String name;
    int units;

    void input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Units: ");
        units = sc.nextInt();
    }

    void calculate() {

        double bill;

        if (units < 0) {
            System.out.println("Invalid Units");
            return;
        }

        if (units <= 100) {

            bill = units * 2;

        } else if (units <= 200) {

            bill = 100 * 2 + (units - 100) * 3;

        } else {

            bill = 100 * 2 + 100 * 3 +
                   (units - 200) * 5;
        }

        System.out.println("Customer: " + name);
        System.out.println("Total Bill: Rs. " + bill);
    }

    public static void main(String[] args) {

        CurrentBill e1 = new CurrentBill();

        e1.input();
        e1.calculate();
    }
}
