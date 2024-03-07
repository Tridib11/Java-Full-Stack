package Stack_rebuild;

import java.util.Stack;

//https://leetcode.com/problems/removing-stars-from-a-string/
public class RemoveStarsFromAString_Leetcode {
    class Solution {
        public String removeStars(String s) {
            Stack<Character> stack=new Stack<>();
            for(char ch:s.toCharArray()){
                if(ch=='*'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
            StringBuilder result=new StringBuilder();
            while(!stack.isEmpty()){
                result.append(stack.peek());
                stack.pop();
            }

            return result.reverse().toString();
        }
    }
}
