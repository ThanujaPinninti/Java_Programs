// Java Program to show the use of
// Relational Operators
import java.io.*;

// Driver Class
class RelationalOperator {
    
    // main function
    public static void main(String[] args)
    {
        // Comparison operators
        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }
}
/*
 * javac RelationalOperator.java
java RelationalOperator      
a > b: true
a < b: false
a >= b: true
a <= b: false
a == c: false
a != c: true
 */