package Stack_rebuild;

import java.util.Stack;
//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
public class NextGreaterElement_GFG {
    class Solution
    {
        //Function to find the next greater element for each element of the array.
        public static long[] nextLargerElement(long[] arr, int n)
        {
           long[] nge=new long[n];
            Stack<Long> stack=new Stack<>();
            for(int i=n-1;i>=0;i--){
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(i<n){
                    if(!stack.isEmpty()){
                        nge[i]=stack.peek();
                    }
                    else{
                        nge[i]=-1;
                    }
                }
                stack.push(arr[i]);
            }
            return nge;

        }
    }
}
