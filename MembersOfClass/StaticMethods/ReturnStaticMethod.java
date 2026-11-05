package MembersOfClass.StaticMethods;

public class ReturnStaticMethod {
    

    static int square(int number) {

        return number * number;
    }

    public static void main(String[] args) {

        int result = ReturnStaticMethod.square(5);

        System.out.println(result);
    }
}
    

