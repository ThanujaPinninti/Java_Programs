public class ExplicitCasting {
     public static void main(String[] args) {
        double d = 12345.678;   // double (8 bytes)

        // Downcasting step by step
        long l = (long) d;     // double → long
        int i = (int) l;       // long → int
        short s = (short) i;   // int → short
        byte b = (byte) s;     // short → byte

        System.out.println("Original double value: " + d);
        System.out.println("After casting to long: " + l);
        System.out.println("After casting to int: " + i);
        System.out.println("After casting to short: " + s);
        System.out.println("After casting to byte: " + b);
    }
    
}
/*
 * javac ExplicitCasting.java 
 java ExplicitCasting      
Original double value: 12345.678
After casting to long: 12345
After casting to int: 12345
After casting to short: 12345
After casting to byte: 57
 */