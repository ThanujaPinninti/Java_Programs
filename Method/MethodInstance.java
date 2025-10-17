class Test{
    String n = "";

    //Instance Method
    public void setName(String n){
        this.n=n;
    }
}
class MethodInstance {
    public static void main(String[] args) {
        //Creat Object
        Test t = new Test();

        //Call instance Method 
        t.setName("Hello Thanuja");
        System.out.println(t.n);
    }

    
}
/*
 * javac MethodInstance.java
 java MethodInstance      
Hello Thanuja
 */
