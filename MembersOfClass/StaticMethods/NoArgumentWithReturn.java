package MembersOfClass.StaticMethods;

public class NoArgumentWithReturn {
    

    static int getNumber() {
        int a = 100;
        return a;
    }

    public static void main(String[] args) {
        int result =  NoArgumentWithReturn.getNumber();

        System.out.println("Number: " + result);
    }
}
    

