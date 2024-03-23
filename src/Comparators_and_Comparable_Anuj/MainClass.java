package Comparators_and_Comparable_Anuj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Students> students=new ArrayList<>();
        students.add(new Students(23,"Ram"));
        students.add(new Students(35,"Shyam"));
        students.add(new Students(83,"Aman"));
        students.add(new Students(13,"Ram"));
        students.add(new Students(13,"Anuj"));
        Collections.sort(students,new SortByNameThenMarks());
        students.forEach(System.out::println);

    }
}

class SortByNameThenMarks implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if(o1.name.equals(o2.name)){
            return o1.marks-o2.marks;
        }else{
            return o1.name.compareTo(o2.name);
        }
    }
}