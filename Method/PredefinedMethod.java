public class PredefinedMethod {
    public static void main(String[] args){
        int max = Math.max(10,20);//Predefined Static method
        String text = "Hello".toUpperCase(); //Predefined instance method
        System.out.println(max);
        System.out.println(text);
    }
    
}
/*
 * javac PredefinedMethod.java
java PredefinedMethod      
20
HELLO
 */