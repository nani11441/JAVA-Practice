package Identifiers;
public class Identifiers2 {
    public static void main(String[] args) {
        // Valid identifiers
        int myVariable = 10; // Valid identifier
        int _myVariable = 20; // Valid identifier starting with an underscore
        int $myVariable = 30; // Valid identifier starting with a dollar sign
        int myVariable123 = 40; // Valid identifier with numbers

        // Invalid identifiers (uncommenting these lines will cause compilation errors)
        // int 123myVariable = 50; // Invalid identifier starting with a number
        // int my Variable = 60; // Invalid identifier with a space
        // int my-Variable = 70; // Invalid identifier with a hyphen

        // Displaying the values of valid identifiers
        System.out.println("myVariable: " + myVariable);
        System.out.println("_myVariable: " + _myVariable);
        System.out.println("$myVariable: " + $myVariable);
        System.out.println("myVariable123: " + myVariable123);
    }
    
}
