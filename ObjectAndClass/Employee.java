package ObjectAndClass;

import java.util.Scanner;


class Employee {

    // Instance variables
    String empName;
    int empId;
    double salary;

    // Method
    void displayEmployee() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: " + salary);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.empName = "Nani";
        e1.empId = 101;
        e1.salary = 25000;

        Employee e2 = new Employee();

        e2.empName = "Ravi";
        e2.empId = 102;
        e2.salary = 30000;

        Employee e3 = new Employee();

        e3.empName = "Kiran";
        e3.empId = 103;
        e3.salary = 35000;

        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();
    }
}
