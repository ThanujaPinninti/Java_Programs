public class CommandLineExample {
    public static void main(String[] args) {
        //Checking if length of args array is
        //Greater than 0
        if(args.length>0){
            //Print Statements
            System.out.println("The Command line "+" arguments are:");
            //Iterating the args array
            //Using for each loop
            for(String val:args)
            System.out.println(val);
        }
        else System.out.println("No command line "+"arguments found.");
    }
    
}
/*
 *  javac CommandLineExample.java
 java CommandLineExample Hello Welcome Thanuja
The Command line  arguments are:
Hello
Welcome
Thanuja
 */