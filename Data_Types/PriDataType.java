class PriDataType{
public static void main (String args[])
    {

        // Creating and initializing custom character
        char a = 'T';

        // Integer data type is generally
        // used for numeric values
        int i = 25;

        // use byte and short
        // if memory is a constraint
        byte b = 8;

        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;

        short s = 2002;

        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;

        // by default fraction value
        // is double in java
        double d = 1.023654789;

        // for float use 'f' as suffix as standard
        float f = 9.3214569f;

        // need to hold big range of numbers then we need
        // this data type
        long l = 123654;

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    } 
    
    
}
/*
 * javac PriDataType.java
PS E:\Java Program\Programs\Data_Types> java PriDataType      
char: T
integer: 25
byte: 8
short: 2002
float: 9.321457
double: 1.023654789
long: 123654
 */