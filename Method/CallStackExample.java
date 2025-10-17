public class CallStackExample {
    public static void main(String[] args) {
        System.out.println("Main method started");
        methodA();
        System.out.println("Main method ended");
    }

    static void methodA(){
        System.out.println("Entered methodA");
        methodB();
        System.out.println("Exiting methodA");
    }

    static void methodB(){
        System.out.println("Entered methodB");
        methodC();
        System.out.println("Exiting methodB");
    }

    static void methodC(){
        System.out.println("Entered methodC");
        System.out.println("Exiting methodC");
    }
    
}
/*
 *  javac CallStackExample.java
java CallStackExample      
Main method started
Entered methodA
Entered methodB
Entered methodC
Exiting methodC
Exiting methodB
Exiting methodA
Main method ended
 */