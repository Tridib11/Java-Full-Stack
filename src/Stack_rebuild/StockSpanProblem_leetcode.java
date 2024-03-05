package Stack_rebuild;
//https://leetcode.com/problems/online-stock-span/description/
import java.util.Stack;

public class StockSpanProblem_leetcode {
    class StockSpanner {
        Stack<int[]> stack;
        public StockSpanner() {
            stack=new Stack<>();
        }

        public int next(int price) {
            int span=1;
            while(!stack.isEmpty() && stack.peek()[0]<=price){
                span+=stack.peek()[1];
                stack.pop();
            }
            stack.push(new int[]{price, span});
            return span;
        }

    }
}
