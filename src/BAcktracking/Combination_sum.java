package BAcktracking;
//https://leetcode.com/problems/combination-sum/description/
import java.util.ArrayList;
import java.util.List;

public class Combination_sum {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> comb=new ArrayList<>();
        generateCombinations(0,candidates,new ArrayList<>(),comb,target);
        return comb;
    }
    static void generateCombinations(int start,int[] nums,List<Integer> current,List<List<Integer>> comb,int target){
        if(target==0){
            comb.add(new ArrayList<>(current));
        }
        if(target<0){
            return;
        }

        for (int i = start; i<=nums.length; i++)
        {
            current.add(nums[i]);
            generateCombinations(i,nums,current,comb,target-nums[i]);
            current.removeLast();
        }
    }
}
