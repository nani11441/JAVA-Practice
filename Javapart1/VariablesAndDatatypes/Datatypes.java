package VariablesAndDatatypes;

public class Datatypes {
    public static void main(String[] args) {
        // Primitive data types
        int a = 10; // Integer
        double b = 20.5; // Double
        char c = 'A'; // Character
        boolean d = true; // Boolean

        // Non-primitive data types
        String e = "Hello, World!"; // String
        int[] f= {1, 2, 3, 4, 5}; // Array

        // Displaying the values of variables
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("String: " + e);
        
        System.out.print("Array: ");
        for (int num : f) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
