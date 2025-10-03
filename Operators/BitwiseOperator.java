// Java Program to show the use of
// bitwise operators
import java.io.*;

class BitwiseOperator 
{
    public static void main(String[] args)
    {
        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;
      
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
    }
}
/*
 *  javac BitwiseOperator.java
 java BitwiseOperator      
d & e : 8
d | e : 14
d ^ e : 6
~d : -11
d << 2 : 40
e >> 1 : 6
e >>> 1 : 6
 */