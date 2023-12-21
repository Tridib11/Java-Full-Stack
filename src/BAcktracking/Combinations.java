package BAcktracking;

import java.util.*;
//https://leetcode.com/problems/combinations/description/
public class Combinations {
    public static void main(String[] args) {
        int n=4,k=2;
        System.out.println(combine(n,k));

    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> subsets=new ArrayList<>();
        generateSubsets(1,n,new ArrayList<>(),subsets,k);
        return subsets;
    }
    static void  generateSubsets(int start,int n,List<Integer> current,List<List<Integer>> subsets,int k){
        if(current.size()==k){
            subsets.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=n;i++){
            current.add(i);
            generateSubsets(i+1,n,current,subsets,k);
            current.removeLast();
        }
    }

}
