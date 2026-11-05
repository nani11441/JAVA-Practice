package MembersOfClass.StaticMethods;

public class StaticMethod {
    static void addition(){
        int a=23;
        int b=50;

        int result= a+b;
        System.out.println("Addition :"+result );
    }
    public static void main(String[] args) {
        StaticMethod.addition();
    }
    
}
