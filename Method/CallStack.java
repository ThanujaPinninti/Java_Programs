public class CallStack {
    public static void main(String[] args) {
        System.out.println("Main starts");
        greet();
        System.out.println("Min ends");
    }

    static void greet(){
        System.out.println("Hello from greet()");
        display();
    }

    static void display(){
        System.out.println("Hello from display()");
    }
    
}
