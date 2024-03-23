package Comparators_and_Comparable_Anuj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Students> students=new ArrayList<>();
        students.add(new Students(23,"Ram"));
        students.add(new Students(35,"Shyam"));
        students.add(new Students(83,"Aman"));
        students.add(new Students(13,"Rohit"));
        students.add(new Students(13,"Anuj"));
        Collections.sort(students);
        students.forEach(System.out::println);

    }
}
