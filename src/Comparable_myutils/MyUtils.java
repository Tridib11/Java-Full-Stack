package Comparable_myutils;

import java.util.ArrayList;

public class MyUtils {
    public static <T> void iterateIntegerList(ArrayList<T> integerList) {
        for(T num: integerList){
            System.out.println(num);
        }
    }

}
