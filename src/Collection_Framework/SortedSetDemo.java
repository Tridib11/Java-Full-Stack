package Collection_Framework;

import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable {
    String name;
    Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student) o;
        Integer id=student.getId();
        return Integer.compare(this.id,id);


    }
}
public class SortedSetDemo {

    public static void main(String[] args) {
//        SortedSet<Integer> sortedSet=new TreeSet<>();
//        sortedSet.add(10);
//        sortedSet.add(2);
//        sortedSet.add(80);
//        sortedSet.add(1);


        SortedSet<Student> sortedSet=new TreeSet<>();
        sortedSet.add(new Student("raj",8));
        sortedSet.add(new Student("rahul",90));
        sortedSet.add(new Student("simran",10));
        sortedSet.add(new Student("rohan",1));

        System.out.println(sortedSet);



    }
}
