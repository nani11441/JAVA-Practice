package MembersOfClass.StaticMethods;

public class RulesOfStaticMethods {


    /*Important rules of static methods
1. Static methods can directly access static variables.
2. Static methods can directly call other static methods.
3. Static methods cannot directly access instance variables.
4. Static methods cannot directly call instance methods.
5. We can access instance members through an object reference. */
    

    int a = 10;

    static int b = 20;

    static void display() {

        // System.out.println(a); // Error

        System.out.println(b);
    }

    public static void main(String[] args) {

        RulesOfStaticMethods obj = new RulesOfStaticMethods ();

        System.out.println(obj.a);

        display();
    }
}
    

