// Java Program to show the use of
// Logical operators
import java.io.*;

class LogicalOperator {
  
      // Main Function
    public static void main (String[] args) {
      
        // Logical operators
        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}
/*
 *  javac LogicalOperator.java   
java LogicalOperator      
x && y: false
x || y: true
!x: false
 */