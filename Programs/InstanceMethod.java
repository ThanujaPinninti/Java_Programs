class Student {
    int age;
    void showAge() { //instance method
        System.out.println("Age: "+age);
    }
}

class InstanceMethod {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.age = 23;
        s1.showAge(); // called via object 
    }
}
/*
 * javac InstanceMethod.java
java InstanceMethod      
Age: 23
 */
