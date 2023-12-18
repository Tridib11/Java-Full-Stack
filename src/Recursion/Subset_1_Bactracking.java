package Recursion;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/subsets/description/
public class Subset_1_Bactracking {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(subsets(nums));
    }
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> resultList=new ArrayList<>();
        backTrack(resultList,new ArrayList<>(),nums,0);
        return resultList;
    }
    static void backTrack(List<List<Integer>> resultSet,List<Integer> tempSet,int[] nums,int start){
        resultSet.add(new ArrayList<>(tempSet));
        for (int i = start; i <nums.length ; i++) {
            tempSet.add(nums[i]);
            backTrack(resultSet,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
}
