package BAcktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutations_2 {
    public static void main(String[] args) {

    }

    static List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> resultList=new ArrayList<>();
        Arrays.sort(nums);
        backTrack(resultList,new ArrayList<>(),nums,new boolean[nums.length]);
        return resultList;
    }
    static void backTrack(List<List<Integer>> resultList,ArrayList<Integer> tempList,int[] nums,boolean[] used){
        if(tempList.size()==nums.length && !resultList.contains(tempList)){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i]=true;
            tempList.add(nums[i]);
            backTrack(resultList,tempList,nums,used);
            used[i]=false;
            tempList.remove(tempList.size()-1);
        }
    }



}
