class Student{
    //Private variable(hidden from outside)
    private String name;
    private int age;

    //Getter for name
    public String getName(){
        return name;
    }

    //setter for name
    public void setName(String name){
        this.name =name;
    }
    //Getter for age
    public int getAge(){
        return age;
    }

    //setter for age (with validation)
    public void setAge(int age){
        if(age >0){
            this.age= age;
        }else{
            System.out.println("Invalid age!");
        }
    }
}

public class Encapsulation {
    public static void main(String args[]){
        Student s= new Student();

        //Using setter to assign values
        s.setName("Thanuja");
        s.setAge(24);

        //using getters to retrieve values
        System.out.println("Name: "+s.getName());
        System.out.println("Age: "+s.getAge());
    }
}
    /*
}javac Encapsulation.java
java Encapsulation      
Name: Thanuja
Age: 24
*/