package Stack_rebuild;
import java.util.*;
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
public class RemoveAllAdjacentDuplicatesInaAString {
    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i = s.length() - 1; i >= 0; i--) {
                if (stack.isEmpty() || !stack.peek().equals(s.charAt(i))) {
                    stack.push(s.charAt(i));
                } else {

                    stack.pop();
                }
            }
            StringBuilder result = new StringBuilder();
            while (!stack.isEmpty()) {
                result.append(stack.peek());
                stack.pop();
            }
            return result.toString();
        }
    }
}
