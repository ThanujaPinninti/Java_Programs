public class InstanceVariable { //(In place of InstanceVariable use Student)
     // Instance variables (each object gets its own copy)
    String name;
    int age;

    // Constructor to initialize instance variables
    InstanceVariable(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating two objects with different values
        InstanceVariable s1 = new InstanceVariable("Thanu", 20);
        InstanceVariable s2 = new InstanceVariable("Manasa", 22);

        // Each object has its own copy of 'name' and 'age'
        s1.display();  
        s2.display();  
    }
}
/*
 *  javac InstanceVariable.java  
 java InstanceVariable      
Name: Thanu, Age: 20
Name: Manasa, Age: 22
 */