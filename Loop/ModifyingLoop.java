// Java program demonstrates 
// modification in i variable
import java.io.*;

class ModifyingLoop {
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
              
                // Modifies the loop variable and skips
                // the next iteration
                i++;
            }
            System.out.println(i);
        }
    }
}