package BAcktracking;

import java.util.ArrayList;
import java.util.List;

public class permutations_1 {
    public static void main(String[] args) {

    }
    static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> resultList=new ArrayList<>();
        backTrack(resultList,new ArrayList<>(),nums);
        return resultList;
    }
    static void backTrack(List<List<Integer>> resultList,ArrayList<Integer> tempList,int[] nums){
        if(tempList.size()==nums.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int num:nums){
            if(tempList.contains(num)){
                continue;
            }
            tempList.add(num);
            backTrack(resultList,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }


}
