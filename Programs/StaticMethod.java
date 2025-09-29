class MathUtil{
    static int square (int n) { //staic method
        return n*n;

    }
}
public class StaticMethod {
    public static void main(String[] args) {
        int result = MathUtil.square(5); //called via class name
        System.out.println(result);
    }
    
}
/*
 *  javac StaticMethod.java  
  java StaticMethod      
25
 */