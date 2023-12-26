package OOPS;

public class test1 {
    public static void main(String[] args) {
        Student Tridib=new Student(12,"Rohan",34);
//        System.out.println(Tridib);
//        Tridib.marks=23;
//        System.out.println(Tridib.marks);
        System.out.println(Tridib.marks);
        System.out.println(Tridib.name);
        System.out.println(Tridib.rno);
//        Tridib.changeName("Iron man");
//        Tridib.greeting();


        /*

        new keyword does the DMA- Dynamic Memory Allocation

        Student  student1      =         new Student();
        compile time                     Run time
        memory allocated in the          memory allocated in the
        stack memory                     Heap memory
         */
    }
}

class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello my name is "+name);
    }
    void changeName(String newName){
        name=newName;
    }

    // Default constructor
    Student() {
        this.rno = 13;
        this.name = "Tridib Ghosh";
        this.marks = 88.5f;
    }

    // Parameterized constructor
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
/*
 in Java, all constructors in a class must have the same name as the class itself.
This is a fundamental rule in Java.
The constructor name must exactly match the name of the class
 */
