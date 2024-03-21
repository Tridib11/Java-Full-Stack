package Comparable_and_Comparator;

import Comparable_myutils.MyUtils;

import java.util.ArrayList;
import java.util.Collections;

public class collection_sort {
    public static void main(String[] args) {
        ArrayList<Integer> integerList=new ArrayList<>();
        integerList.add(2);
        integerList.add(1);
        integerList.add(3);
        integerList.add(0);
        integerList.add(5);
        integerList.add(4);

        MyUtils.iterateList(integerList);

        System.out.println("----------");
        Collections.sort(integerList);

        MyUtils.iterateList(integerList);
    }


}
