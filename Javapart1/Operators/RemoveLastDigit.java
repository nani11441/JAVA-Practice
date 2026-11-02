package Operators;

public class RemoveLastDigit {
    public static void main(String[] args) {
        int n = 12345;

        // Remove the last digit by dividing by 10
        int result = n / 10;

        System.out.println("Original number: " + n);
        System.out.println("Number after removing last digit: " + result);
    }
    
}
