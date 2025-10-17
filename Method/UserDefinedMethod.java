public class UserDefinedMethod {
    // user-defined method
    void greet(){
        System.out.println("Hello, Java");
    } 
    public static void main(String[] args){
        UserDefinedMethod obj = new UserDefinedMethod(); //Create object
        obj.greet(); // calling user-defined method
    }
}
/*
 * javac UserDefinedMethod.java
 java UserDefinedMethod      
Hello, Java
 */