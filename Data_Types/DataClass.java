// Demonstrating how to create a class
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(model + " " + year);
    }
}

public class DataClass {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2025);
        myCar.display(); 
    }
    
}
