package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/permutations-ii/description/
public class Permutations_2_backtracking {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(permute(arr));
    }
    static List<List<Integer>> permute(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> resultList=new ArrayList<>();
        backTracking(resultList,new ArrayList<>(),arr,new boolean[arr.length]);
        return resultList;
    }
    static void backTracking(List<List<Integer>> resultList,List<Integer> tempList,int[] arr,boolean[] used){
        if(tempList.size()==arr.length && !resultList.contains(tempList)){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            tempList.add(arr[i]);
            backTracking(resultList,tempList,arr,used);
            used[i]=false;
            tempList.remove(tempList.size()-1);
        }
    }


}

