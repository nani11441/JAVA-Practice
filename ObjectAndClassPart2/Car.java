package ObjectAndClassPart2;
class Car {

    // Instance variables
    String brand;
    String color;
    int speed;

    // Method to start car
    void start() {
        System.out.println(brand + " car is starting");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Car Speed: " + speed + " km/h");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // First object
        Car c1 = new Car();

        c1.brand = "BMW";
        c1.color = "Black";
        c1.speed = 120;

        // Second object
        Car c2 = new Car();

        c2.brand = "Audi";
        c2.color = "White";
        c2.speed = 150;

        c1.start();
        c1.displayDetails();

        c2.start();
        c2.displayDetails();
    }
}
