public class CommandLine {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
/*
 * javac CommandLine.java
 java CommandLine Java Python C++
Number of arguments: 3
Argument 0: Java
Argument 1: Python
Argument 2: C++
 */