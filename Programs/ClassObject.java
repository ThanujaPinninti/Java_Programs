// Defining a class
class Student {
    // Fields
    int id;
    String name;

    //Method
    void display(){
        System.out.println("Id: "+id+", Name: "+name);
    }
}

//main class
public class ClassObject{
    public static void main(String[] args) {
         // Creating objects
         Student s1= new Student();
         Student s2= new Student();

         //Assigning Values
         s1.id = 36;
         s1.name = "Thanuja";

         s2.id = 33;
         s2.name = "Manasa";

         //Calling method
         s1.display();
         s2.display();

    }
}
/*
 * javac ClassObject.java
java ClassObject      
Id: 36, Name: Thanuja
Id: 33, Name: Manasa
 */