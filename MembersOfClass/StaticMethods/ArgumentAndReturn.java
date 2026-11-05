package MembersOfClass.StaticMethods;

public class ArgumentAndReturn {


    static int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    public static void main(String[] args) {
        int answer = ArgumentAndReturn.multiplication(10, 5);

        System.out.println("Multiplication: " + answer);
    }
}
    

