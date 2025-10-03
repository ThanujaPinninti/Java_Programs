// Java Program to show the use of
// Unary Operators
import java.io.*;

// Driver Class
class UnaryOperator {
      // main function
    public static void main(String[] args)
    {
        // Interger declared
        int a = 10;
        int b = 10;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}
/*
 *  javac UnaryOperator.java     
java UnaryOperator      
Postincrement : 10
Preincrement : 12
Postdecrement : 10
Predecrement : 8
 */