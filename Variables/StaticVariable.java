class StaticVariable {
    // Static variable
    static String college = "Osmania University";

    String name; // instance variable

    StaticVariable(String n) {
        name = n;
    }

    void display() {
        System.out.println(name + " studies at " + college);
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable("Thanuja");
        StaticVariable s2 = new StaticVariable("Manasa");

        s1.display();
        s2.display();

        // Changing static variable affects all objects
        StaticVariable.college = "Kakatiya University";
        s1.display();
        s2.display();
    }
}
/*
 * javac StaticVariable.java
 java StaticVariable      
Thanuja studies at Osmania University
Manasa studies at Osmania University
Thanuja studies at Kakatiya University
Manasa studies at Kakatiya University
 */
