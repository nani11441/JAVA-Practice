package ObjectAndClassPart2;

public class Employee1 {

    // 1. instance variable
    int id;
    String name;
    double salary;

    //2. intance method
     
    void display(){
        System.out.println("Employee Id :" +id);
        System.out.println("Employee Name :"+name);
        System.out.println("Employee Salary:"+salary);
    }
// 3.Main method
    public static void main(String[] args) {
        // Object creation
        Employee1 e1=new Employee1();

        // Assign values
        e1.id=123;
        e1.name="Nani";
        e1.salary=10000;

// calling method
        e1.display();
    }
    
}
