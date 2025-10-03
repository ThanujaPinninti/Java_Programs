public class OperatorPrecedenceAssociativity {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        // Example 1: Precedence of * over +
        int result1 = a + b * c;    // b*c first → 5*2=10, then a+10 → 20
        System.out.println("a + b * c = " + result1);

        // Example 2: Left-to-right associativity of +
        int result2 = a + b + c;    // (a+b)+c → (10+5)+2 = 17
        System.out.println("a + b + c = " + result2);

        // Example 3: Right-to-left associativity of assignment
        int x, y, z;
        x = y = z = 50;             // z=50 → y=50 → x=50
        System.out.println("Assignments: x=" + x + ", y=" + y + ", z=" + z);

        // Example 4: Unary operators (right-to-left)
        int p = 5;
        int result3 = ++p + --p;    // ++p=6 → --p=5 → 6+5=11
        System.out.println("++p + --p = " + result3);

        // Example 5: Mixed precedence (relational > logical)
        boolean check = (a > b) && (b > c);  // (10>5) && (5>2) → true && true → true
        System.out.println("(a > b) && (b > c) = " + check);

        // Example 6: Bitwise shift with left-to-right associativity
        int result4 = (a + b) << c; // (10+5)<<2 → 15<<2 → 60
        System.out.println("(a + b) << c = " + result4);

        // Example 7: Parentheses changing precedence
        int result5 = (a + b) * c;  // (10+5)*2 → 15*2=30
        System.out.println("(a + b) * c = " + result5);
    }
}
/*
 *  javac OperatorPrecedenceAssociativity.java
java OperatorPrecedenceAssociativity  
a + b * c = 20
a + b + c = 17
Assignments: x=50, y=50, z=50
++p + --p = 11
(a > b) && (b > c) = true
(a + b) << c = 60
(a + b) * c = 30
 */