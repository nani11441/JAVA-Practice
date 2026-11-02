package GlobalVariables;
public class globalAreaVariables {

    // Global variables (class-level variables)
    static int globalInt = 100; // Static variable
    static String globalString = "Hello, World!"; // Static variable

    public static void main(String[] args) {
        // Accessing global variables within the main method
        System.out.println("Global Integer: " + globalInt);
        System.out.println("Global String: " + globalString);

        // Modifying global variables
        globalInt += 50;
        globalString += " Welcome to Java!";

        // Displaying modified global variables
        System.out.println("Modified Global Integer: " + globalInt);
        System.out.println("Modified Global String: " + globalString);
    }

}