package Normal;
//https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75
public class Find_Pivot_index {
    public static void main(String[] args) {
//        System.out.println(pivot_index());
    }

    static int pivot_index(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int leftSum=0;
        int rightSum=sum;
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            if(rightSum==leftSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}
