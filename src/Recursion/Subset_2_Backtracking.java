package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/subsets-ii/description/
public class Subset_2_Backtracking {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(subsets(nums));
    }
    static List<List<Integer>> subsets(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> resultList=new ArrayList<>();
        backTrack(resultList,new ArrayList<>(),nums,0);
        return resultList;
    }
    static void backTrack(List<List<Integer>> resultSet,List<Integer> tempSet,int[] nums,int start){
        if(resultSet.contains(tempSet)) {
            return;
        }
        resultSet.add(new ArrayList<>(tempSet));
        for (int i = start; i <nums.length ; i++) {
            tempSet.add(nums[i]);
            backTrack(resultSet,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
}
