package Stack;

import java.util.Stack;
//https://leetcode.com/problems/next-greater-element-ii/description/

public class NextGreaterElement_ii {
    public static void main(String[] args) {

    }
    /*
    In the given code, we are pushing the elements of the input array nums into a stack in reverse order. Then, we are iterating over the nums array again in reverse order and popping elements from the stack until we find an element greater than the current element. We store this greater element in the greater array at the corresponding index. Finally, we push the current element into the stack.
The last line return greater returns the greater array which contains the next greater element for each element in the input array.
We push the current element into the stack to compare it with the next elements in the array. If the next element is greater than the current element, we can pop the current element from the stack and update the greater array with the next greater element. If the next element is smaller than the current element, we need to keep the current element in the stack so that we can compare it with the next elements in the array.
Therefore, pushing the current element into the stack is necessary to keep track of the elements that have not yet found their next greater element.
     */
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stak=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            stak.push(nums[i]);
        }
        int[] greater=new int[nums.length];
        for (int i = nums.length-1;i>=0;i--) {
            while(!stak.isEmpty() && stak.peek()<=nums[i]){
                stak.pop();
            }
            greater[i]=stak.isEmpty()?-1:stak.peek();
            stak.push(nums[i]);
        }
        return greater;

    }
}
