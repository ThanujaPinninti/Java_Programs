public class CallingStaticMethod {
    static void display(){
        System.out.println("Static Method Called");
    }

    public static void main(String[] args){
        CallingStaticMethod.display(); //Calling Static Method using Class names
    }
    
}
/*
 * javac CallingStaticMethod.java
java CallingStaticMethod      
Static Method Called
 */