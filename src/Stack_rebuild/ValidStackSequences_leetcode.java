package Stack_rebuild;

import java.util.Stack;

/*
Company Tags   : MICROSOFT
Leetcode Link  : https://leetcode.com/problems/removing-stars-from-a-string/
 */
public class ValidStackSequences_leetcode {
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            int n=pushed.length;
            int i=0,j=0;
            Stack<Integer> stack=new Stack<>();
            while(i<n && j<n){
                stack.push(pushed[i]);
                while(!stack.isEmpty() && stack.peek()==popped[j]){
                    stack.pop();
                    j++;
                }
                i++;
            }
            return stack.isEmpty();
        }
    }
}
