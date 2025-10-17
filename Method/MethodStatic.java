public class MethodStatic {
    //Static Method
    public static void greet(){
        System.out.println("Hello Geek!");
    }

    public static void main(String[] args){
        //Calling static method without creating object
        greet();
        MethodStatic.greet(); //using class name
    }
    
}
/*
 * javac MethodStatic.java       
java MethodStatic      
Hello Geek!
Hello Geek!
 */