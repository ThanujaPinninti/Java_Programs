class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}
 class DowncastingExample {
    public static void main(String[] args) {
        Vehicle v = new Car();   // Upcasting (implicit)

        // Explicit Downcasting: Vehicle → Car
        Car c = (Car) v;

        c.start();  // From Vehicle
        c.drive();  // From Car
    }
}
/*javac DowncastingExample.java
 * java DowncastingExample
Vehicle starts
Car is driving
 */