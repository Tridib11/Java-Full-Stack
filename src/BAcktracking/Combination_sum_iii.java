package BAcktracking;
import java.util.*;
//https://leetcode.com/problems/combination-sum-iii/
public class Combination_sum_iii {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> subsets=new ArrayList<>();
        generateSubsets(1,9,new ArrayList<>(),subsets,k,n);
        return subsets;
    }
    static void generateSubsets(int start,int end,List<Integer> current,List<List<Integer>> subsets,int k,int target){
        if(target==0 && current.size()==k){
            subsets.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=end;i++){
            current.add(i);
            generateSubsets(i+1,end,current,subsets,k,target-i);
            current.removeLast();
        }
    }

}
