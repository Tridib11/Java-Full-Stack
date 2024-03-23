package Comparators_and_Comparable_Anuj;

public class Students {
    int marks;
    String name;
    public Students(int marks,String name){
        super();
        this.marks=marks;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
