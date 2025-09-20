// SIngle Inheritance
class Animal{
    void eat(){
    System.out.println("Eating..");
    }
}
// Multi level Inheritance
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("Weeping...");
    }
}
// Hierarchical Inheritance
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}
//Multiple Inheritance
interface Pet{
    void play();
}
interface Guard {
    void protect();
}
class GermanShepherd extends Dog implements Pet,Guard{
    public void play(){
        System.out.println("Playing with kids...");
    }
    public void protect(){
        System.out.println("Protecting the house...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Single Inheritance
        Dog d= new Dog();
        d.eat();
        d.bark();

        //Muttilevel inheritance
        Puppy p= new Puppy();
        p.eat();
        p.bark();
        p.weep();

        //Hierarchical Inheritance
        Cat c= new Cat();
        c.eat();
        c.meow();

        //Multiple Inheritance
        GermanShepherd g= new GermanShepherd();
        g.eat();
        g.bark();
        g.play();
        g.protect();
    }
    
}
/*
 javac Inheritance.java  
java Inheritance      
Eating..
Barking... //si
Eating.. 
Barking...
Weeping...//mi
Eating..
Meowing...//hi
Eating..
Barking...
Playing with kids...
Protecting the house...//via
 */