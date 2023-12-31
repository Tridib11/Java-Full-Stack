package Normal;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] temp=nums;
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                return new int[]{left,right};
            }
            if(nums[left]+nums[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }


}
