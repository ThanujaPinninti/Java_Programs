public class StackOverflowExample {
    static void recurse(){
        recurse(); // no base case
    }

    public static void main(String[] args) {
        recurse();
    }
    
}
