package GlobalVariables;

public class VariableReintialization {
    public static void main(String[] args) {
        // Global variable (class-level variable)
         int globalVar = 100; // Static variable

        // Displaying the initial value of the global variable
        System.out.println("Initial Global Variable: " + globalVar);

        // Reinitializing the global variable
        globalVar = 200;

        // Displaying the modified value of the global variable
        System.out.println("Modified Global Variable: " + globalVar);
    }
    
}
