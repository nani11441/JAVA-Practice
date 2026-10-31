import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        double bonus;

        if (salary >= 50000) {
            bonus = salary * 0.20;
        } else if (salary >= 30000) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.05;
        }

        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total Salary = " + (salary + bonus));

       sc.close();
    }
}
