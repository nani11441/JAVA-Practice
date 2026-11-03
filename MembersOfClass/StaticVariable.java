package MembersOfClass;

public class StaticVariable {
    int id;
    String EmpName;
    /*Static variable declaration why because Company name should be same*/

    /*A static variable has one shared class-level copy, not a separate copy for each object. */
    static String CompanyName="Wipro";
    public static void main(String[] args) {
         StaticVariable e1=new StaticVariable();
         e1. id=101;
         e1.EmpName="Nagesh";

          StaticVariable e2=new StaticVariable();
         e2. id=102;
         e2.EmpName="Nani";

          StaticVariable e3=new StaticVariable();
         e3. id=103;
         e3.EmpName="Sai";

          StaticVariable e4=new StaticVariable();
         e4. id=101;
         e4.EmpName="Chintu";

          System.out.println(e1.id);
        System.out.println(e1.EmpName);
        System.out.println(StaticVariable.CompanyName);

        System.out.println("---------------------");

        System.out.println(e2.id);
        System.out.println(e2.EmpName);
        System.out.println(StaticVariable.CompanyName);

        System.out.println("---------------------");

        System.out.println(e3.id);
        System.out.println(e3.EmpName);
        System.out.println(StaticVariable.CompanyName);
            
        
    } 
    
}
