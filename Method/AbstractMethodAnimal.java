abstract class AbstractMethodAnimal {
    abstract void sound(); // abstract method
}

class Dog extends AbstractMethodAnimal {
    void sound() { // implementation
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // calling abstract method through subclass object
    }
}
/*
 *  javac AbstractMethodAnimal.java
java Dog
Bark
 */