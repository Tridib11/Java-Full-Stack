package Stack_rebuild;

import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack=new Stack<>();
            for(char ch:s.toCharArray()){
                if(ch=='('){
                    stack.push(')');
                }
                else if(ch=='{'){
                    stack.push('}');
                }
                else if(ch=='['){
                    stack.push(']');
                }
                else if(stack.isEmpty()|| stack.peek()!=ch){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }
    }
}
