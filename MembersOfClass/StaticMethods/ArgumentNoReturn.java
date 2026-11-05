package MembersOfClass.StaticMethods;

public class ArgumentNoReturn {
    

    static void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }

    public static void main(String[] args) {
       ArgumentNoReturn  .addition(10, 20);
    }
}
    

