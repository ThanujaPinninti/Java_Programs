// Java Program to show the use of
// Arithmetic Operators
import java.io.*;

class ArithmeticOperator
{
    public static void main (String[] args) 
    {
          
        // Arithmetic operators on integers
        int a = 10;
        int b = 3;
      
        // Arithmetic operators on Strings
        String n1 = "15";
        String n2 = "25";

        // Convert Strings to integers
        int a1 = Integer.parseInt(n1);
        int b1 = Integer.parseInt(n2);
           
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a1 + b1 = " + (a1 + b1)); 
          
    }
}
/*
 *  ArithmeticOperator.java
java ArithmeticOperator      
a + b = 13
a - b = 7
a * b = 30
a / b = 3
a % b = 1
a1 + b1 = 40
 */