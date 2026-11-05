package MembersOfClass.StaticVariables;

public class ChangeStaticVariable {
    /*Because both objects share the same static variable. When we change it through the class, the changed value is visible through both objects. */
    

    static String collegeName = "ABC College";

    public static void main(String[] args) {

        ChangeStaticVariable s1 = new ChangeStaticVariable();
        ChangeStaticVariable s2 = new ChangeStaticVariable();

        System.out.println(s1.collegeName);

        ChangeStaticVariable.collegeName = "XYZ College";

        System.out.println(s1.collegeName);
        System.out.println(s2.collegeName);
    }
}
    

