package Stack_rebuild;
import java.util.*;
public class StockSpanPorblem_GFG {

    class Solution {
        static class StockSpanner {
            Stack<int[]> stack;

            public StockSpanner() {
                stack = new Stack<>();
            }

            public int next(int price) {
                int span = 1;
                while (!stack.isEmpty() && stack.peek()[0] <= price) {
                    span += stack.peek()[1];
                    stack.pop();
                }
                stack.push(new int[]{price, span});
                return span;
            }
        }

        // Function to calculate the span of stock’s price for all n days.
        public static int[] calculateSpan(int arr[], int n) {
            StockSpanner spanner = new StockSpanner();
            int[] spans = new int[n];

            for (int i = 0; i < n; i++) {
                spans[i] = spanner.next(arr[i]);
            }

            return spans;
        }
    }


}
