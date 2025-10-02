class WideningExample {
    public static void main(String[] args) {
        byte b = 10;           // 1 byte
        short s = b;           // byte -> short
        int i = s;             // short -> int
        long l = i;            // int -> long
        double d = l;          // long -> double

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("double value: " + d);
    }
}
/*
 * javac WideningExample.java 
java WideningExample      
byte value: 10
short value: 10
int value: 10
long value: 10
double value: 10.0
 */