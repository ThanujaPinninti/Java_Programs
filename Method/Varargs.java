public class Varargs {
    //Method with Variable arguments
    static void display(String... names){
        System.out.println("Number of arguments: "+names.length);
        for(String name : names){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        display("Thanuja");
        display("Manasa","Rajesh","Vinay");
        display();//No arguments
    }
    
}
/*
 *  javac Varargs.java                        
java Varargs      
Number of arguments: 1
Thanuja
Number of arguments: 3
Manasa
Rajesh
Vinay
Number of arguments: 0
 */