abstract class Animal{
    abstract void sound(); //abstract method
    void sleep() { //Concrete method
    System.out.println("Animal Sleep.");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Braks.");
    }
}

public class Abstract {
    public static void main(String args[]){
        Animal a= new Dog();
        a.sound();
        a.sleep();
    }   
}
/*
javac Abstract.java
 java Abstract      
output:
Dog Braks.
Animal Sleep. 
*/