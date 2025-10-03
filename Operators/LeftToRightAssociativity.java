public class LeftToRightAssociativity {
    public static void main(String[] args) {
        // Arithmetic operators (+, -, *, /, %)
        int a = 10, b = 5, c = 2;
        int result1 = a - b + c;  // (10 - 5) + 2 = 7
        int result2 = a / b * c;  // (10 / 5) * 2 = 4
        System.out.println("Arithmetic results: " + result1 + ", " + result2);

        // Relational operators (> < >= <=)
        boolean rel1 = (a > b) == (b > c); // (10 > 5) == (5 > 2) → true == true → true
        boolean rel2 = (a < b) == (b <= c); // (10 < 5) == (5 <= 2) → false == false → true
        System.out.println("Relational results: " + rel1 + ", " + rel2);

        // Logical AND/OR (&&, ||)
        boolean log1 = (a > b) && (b > c) || (c > a); // (true && true) || false → true
        boolean log2 = (a < b) || (b > c) && (a > c); // false || (true && true) → true
        System.out.println("Logical results: " + log1 + ", " + log2);

        // Bitwise operators (&, |, ^, <<, >>)
        int x = 6, y = 3, z = 1; 
        int bit1 = x & y | z;   // (6 & 3) | 1 → (2) | 1 = 3
        int bit2 = x ^ y >> z;  // 6 ^ (3 >> 1) → 6 ^ 1 = 7
        int bit3 = x << y >> z; // ((6 << 3) >> 1) → (48 >> 1) = 24
        System.out.println("Bitwise results: " + bit1 + ", " + bit2 + ", " + bit3);
    }
}
/*
javac LeftToRightAssociativity.java
java LeftToRightAssociativity      
Arithmetic results: 7, 4
Relational results: true, true
Logical results: true, true
Bitwise results: 3, 7, 24
 * 
 */