
package BAcktracking;
import java.util.*;
//https://leetcode.com/problems/combination-sum-ii/description/
public class Combination_sum_ii {
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        int sum=8;
        System.out.println(combinationSum2(arr,sum));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> resultList=new ArrayList<>();
        generateSubsets(0,candidates,new ArrayList<>(),resultList,target);
        return resultList;
    }
    static void generateSubsets(int start,int[] candidates,List<Integer> current,List<List<Integer>> resultList,int target){

        if (target == 0) {
                resultList.add(new ArrayList<>(current));
                return;
            }

        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i-1]==candidates[i]) continue;
            current.add(candidates[i]);
            generateSubsets(i+1,candidates,current,resultList,target-candidates[i]);
            current.removeLast();
        }
    }


}
