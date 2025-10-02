class LocalVariables {
    void show() {
        int num = 100;  // Local variable
        System.out.println("Local Variable: " + num);
    }

    public static void main(String[] args) {
        LocalVariables obj = new LocalVariables();
        obj.show();
    }
}
/*
 * javac LocalVariables.java
java LocalVariables      
Local Variable: 100
 */