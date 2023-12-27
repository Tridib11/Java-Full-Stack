package Constructors;

public class ShallowCopy_DeepCopy {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Tridib";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
        for (int i = 0; i < 3; i++) {
            marks[i] = 0;
        }

    }

    /*
    in Copy constructor we modify the same array thats the reason things gets copied in
    both the arrays (Changes reflect)
    */
    //Shallow copy constructor
//    Student(Student s1){
//        marks=new int[3];
//        this.name=s1.name;
//        this.roll=s1.roll;
//        this.marks=s1.marks;
//    }


    /*
    in Deep Copy a new array is formed so the changes dont really reflect
    (Changes don't reflect)
     */
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }


}
