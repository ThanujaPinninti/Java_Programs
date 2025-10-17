class StaticMethod {
    static void greet(){
        System.out.println("Hello from Static Method!");
    }

    public static void main(String[] args){
        StaticMethod.greet(); //calling static method using class name
    }
    
}
/*
 * javac StaticMethod.java  
 java StaticMethod      
Hello from Static Method!
 */