package Stack;

import java.util.Stack;
////https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
class GFG
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    {
        Stack<Long> stack = new Stack<>();
        long[] greater = new long[n];
        for (int i = n-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            greater[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return greater;
    }
}
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};

    }

    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> s=new Stack<>();
        int[] nextGreater=new int[arr.length];
        for (int i = arr.length-1 ;i >=0 ; i--) {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])   {
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        return nextGreater;
    }
}

