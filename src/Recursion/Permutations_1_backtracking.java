package Recursion;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/permutations/description/
public class Permutations_1_backtracking {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(permute(arr));
    }
    static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> resultList=new ArrayList<>();
        backTracking(resultList,new ArrayList<>(),arr);
        return resultList;
    }
    static void backTracking(List<List<Integer>> resultList,List<Integer> tempList,int[] arr)
    {
        if(tempList.size()==arr.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int number:arr){
            if(tempList.contains(number)){
                continue;
            }
            tempList.add(number);
            backTracking(resultList,tempList,arr);
            tempList.remove(tempList.size()-1);
        }
    }


}
