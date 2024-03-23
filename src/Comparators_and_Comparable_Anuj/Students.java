package Comparators_and_Comparable_Anuj;

public class Students  {
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


    public int compareTo(Students obj) {
        //for Decreasing

//        if(this.marks > o.marks) return -1;
//        else if (this.marks < o.marks) return 1;
//        return 0;

        //for increasing

//        if(this.marks > obj.marks) return 1;
//        else if (this.marks < obj.marks) return -1;
//        return this.name.compareTo(obj.name);

        return this.marks- obj.marks;
    }
}
