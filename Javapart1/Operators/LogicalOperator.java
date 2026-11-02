package Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean a = 10 > 5; // true
        boolean b = 5 > 10; // false

        // Logical operators
        System.out.println("a && b: " + (a && b)); // Logical AND
        System.out.println("a || b: " + (a || b)); // Logical OR
        System.out.println("!a: " + (!a));         // Logical NOT
    }
    
}
