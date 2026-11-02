package Operators;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Compound assignment operators
        a += b; // Equivalent to a = a + b
        System.out.println("After a += b: " + a);

        a -= b; // Equivalent to a = a - b
        System.out.println("After a -= b: " + a);

        a *= b; // Equivalent to a = a * b
        System.out.println("After a *= b: " + a);

        a /= b; // Equivalent to a = a / b
        System.out.println("After a /= b: " + a);

        a %= b; // Equivalent to a = a % b
        System.out.println("After a %= b: " + a);
    }
    
}
