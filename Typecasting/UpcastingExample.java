class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Explicit Upcasting: Dog → Animal
        Animal a = (Animal) d;

        a.sound();   // Calls Dog's overridden method
        // a.fetch(); //  Not allowed, parent reference doesn’t see child methods
    }
}
/*
 *  javac UpcastingExample.java
java UpcastingExample      
Dog barks
 */