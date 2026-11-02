package ObjectAndClass;

import java.util.Scanner;

class StudentGrade {

    int m1, m2, m3, m4, m5;

    void input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 Subject Marks: ");

        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
    }

    void calculate() {

        int total = m1 + m2 + m3 + m4 + m5;

        double average = total / 5.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (m1 < 35 || m2 < 35 || m3 < 35 ||
            m4 < 35 || m5 < 35) {

            System.out.println("Grade: Fail");

        } else if (average >= 90) {

            System.out.println("Grade: A");

        } else if (average >= 75) {

            System.out.println("Grade: B");

        } else if (average >= 60) {

            System.out.println("Grade: C");

        } else {

            System.out.println("Grade: D");
        }
    }

    public static void main(String[] args) {

        StudentGrade s1 = new StudentGrade();

        s1.input();
        s1.calculate();
    }
}
