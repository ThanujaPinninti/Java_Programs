 class InstanceMethod {
    int x=10;

    //Instance Method
    void display(){
        System.out.println("Value of x: "+x);
    }

    public static void main(String[] args){
        InstanceMethod obj =  new InstanceMethod(); // Creating object
        obj.display(); // Calling instance method
    }
    
}
/*
 * javac InstanceMethod.java
 java InstanceMethod      
Value of x: 10
 */