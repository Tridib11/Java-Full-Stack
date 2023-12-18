package Recursion;

import java.util.ArrayList;

public class LinearSearchArrayListPassing {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4,3,2};
//        System.out.println(findAllIndex(arr,4,0,new ArrayList<>()));
        //or
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(findAllIndex(arr,4,0,list));

    }

    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
