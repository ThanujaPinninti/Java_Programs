// Parent class
class Animal{
    //Method Overloading (same name, different parameters)
    void sound(){
        System.out.println("Animal makes a sound");
    }
    void sound(String type){
        System.out.println("Animal sound type: "+type);
    }
}

//child class
class Dog extends Animal{
    //Method Overriding (same name, same parameters as parent)
    @Override
    void sound(){
        System.out.println("Dog barks");
    }

    //Method Overloading inside child class
    void sound(int times){
        System.out.println("Dog barks "+times+" times");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        //Parent reference with parent object
        Animal a1 = new Animal();
        a1.sound();
        a1.sound("Generic");
          // Parent reference with child object (Runtime Polymorphism - Overriding)
        Animal a2 = new Dog();
        a2.sound();            
        a2.sound("Loud");      

        // Child reference with child object (can access overloading in child)
        Dog d = new Dog();
        d.sound();             
        d.sound(3);            
    }
    
}
/*
javac Polymorphism.java
java Polymorphism      
Animal makes a sound
Animal sound type: Generic
Dog barks
Animal sound type: Loud
Dog barks
Dog barks 3 times
 */