package Normal;
//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public static void main(String[] args) {

    }
    public static int maxArea(int[] arr){
        int left=0;
        int right=arr.length-1;
        int maxArea=0;
        while(left<right){
            int area=Math.min(arr[left],arr[right])*(right-left);
            maxArea=Math.max(area,maxArea);
            if(arr[left]<arr[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
