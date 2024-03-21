package Comparable_myutils;

import java.util.ArrayList;

public class MyUtils {
    public static <T> void iterateList(ArrayList<T> List) {
        for(T num: List){
            System.out.println(num);
        }
    }

}
