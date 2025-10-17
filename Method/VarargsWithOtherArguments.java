public class VarargsWithOtherArguments {
    //Takes String as a argument followed by varargs
    static void fun2(String s, int... a){
        System.out.println("String: "+s);
        System.out.println("Number of arguments is: "+a.length);
        //Using for each loop to display contents of a
        for(int i : a)
        System.out.println(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        //Calling fun2() with different paremeter
        fun2("ABCD",100,200);
        fun2("XYZ",1,2,3,4,5);
        fun2("Java");
    }
    
}
/*
 * javac VarargsWithOtherArguments.java
java VarargsWithOtherArguments      
String: ABCD
Number of arguments is: 2
100 
200 

String: XYZ
Number of arguments is: 5
1 
2 
3 
4
5

String: Java
Number of arguments is: 0
 */