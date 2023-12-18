package BAcktracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets_1 {
    public static void main(String[] args) {

    }
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> resultList=new ArrayList<>();
        backtrack(resultList,new ArrayList<>(),nums,0);
        return resultList;
    }
    static void backtrack(List<List<Integer>> resultSets,List<Integer> tempSet,int[] nums,int start){
        resultSets.add(new ArrayList<>(tempSet));
        for (int i = start; i <nums.length ; i++) {
            tempSet.add(nums[i]);
            backtrack(resultSets,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }

}
