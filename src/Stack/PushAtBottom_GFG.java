package Stack;

import java.util.Stack;
//https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class PushAtBottom_GFG {
    class Solution {
        public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
            if(st.isEmpty()){
                st.push(x);
                return st;
            }
            int top=st.pop();
            insertAtBottom(st,x);
            st.push(top);
            return st;
        }
    }
}
