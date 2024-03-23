package Comparators_and_Comparable_Anuj;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Students> students=new ArrayList<>();
        students.add(new Students(23,"Ram"));
        students.add(new Students(12,"Rohan"));
        students.add(new Students(13,"Kisan"));
        students.add(new Students(29,"Rahul"));
        students.add(new Students(1,"Pramanik"));
        students.forEach(System.out::println);

    }
}
