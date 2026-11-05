package MembersOfClass.StaticVariables;

import java.util.Scanner;

class Mobile {
    static String brandName = "Samsung";

    String model;
    double price;

    void display() {
        System.out.println("Brand: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        System.out.println("Enter Mobile 1 Model:");
        m1.model = sc.next();

        System.out.println("Enter Mobile 1 Price:");
        m1.price = sc.nextDouble();

        System.out.println("Enter Mobile 2 Model:");
        m2.model = sc.next();

        System.out.println("Enter Mobile 2 Price:");
        m2.price = sc.nextDouble();

        System.out.println("\nBefore Changing Brand:");
        m1.display();
        m2.display();

        Mobile.brandName = "Apple";

        System.out.println("\nAfter Changing Brand:");
        m1.display();
        m2.display();

        sc.close();
    }
}

