public class RightToLeftAssociativity {
    public static void main(String[] args) {
        // Assignment operators (=, +=, -=)
        int a, b, c;
        a = b = c = 10;   // right-to-left: c=10 → b=10 → a=10
        System.out.println("Assignment (a, b, c): " + a + ", " + b + ", " + c);

        int x = 5;
        int y = 10;
        x += y -= 3;   // y = y - 3 → y=7; then x = x + y → 5+7=12
        System.out.println("Compound assignment (x, y): " + x + ", " + y);

        // Unary operators (++ , -- , ! , ~)
        int p = 5;
        int q = ++p + --p;   // ++p=6, then --p=5 → 6+5=11
        System.out.println("Unary (++ , --): q = " + q);

        boolean flag = false;
        System.out.println("Logical NOT (!): " + !flag); // !false = true

        int num = 5;  // 0101 (binary)
        System.out.println("Bitwise NOT (~): " + ~num);  // ~0101 = 1010... (2’s complement)
    }
}
/*
 *  javac RightToLeftAssociativity.java
java RightToLeftAssociativity      
Assignment (a, b, c): 10, 10, 10
Compound assignment (x, y): 12, 7
Unary (++ , --): q = 11
Logical NOT (!): true
Bitwise NOT (~): -6
 */
