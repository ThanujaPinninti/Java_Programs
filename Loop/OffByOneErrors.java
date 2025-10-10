import java.io.*;
public class OffByOneErrors {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            System.out.println(i+" ");
        }
    }
    
}
/*
 *  javac OffByOneErrors.java   
java OffByOneErrors      
0 
1 
2
3
4
 */
