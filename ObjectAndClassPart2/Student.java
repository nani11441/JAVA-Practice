package ObjectAndClass;

class Student {

    // Instance variables
    String name;
    int rollNumber;
    double marks;

    // Method
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        // First object
        Student s1 = new Student();

        s1.name = "Nani";
        s1.rollNumber = 101;
        s1.marks = 85.5;

        // Second object
        Student s2 = new Student();

        s2.name = "Ravi";
        s2.rollNumber = 102;
        s2.marks = 90.5;

        // Calling methods
        s1.displayDetails();
        s2.displayDetails();
    }
}

