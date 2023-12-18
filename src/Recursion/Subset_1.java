package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/subsets/description/
public class Subset_1 {
    public static void main(String[] args) {
        int[] arr={1,2,2};
//        System.out.println(subset(arr));
        List<List<Integer>> ans=subset(arr);
        for (List<Integer> list:ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:nums){
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
