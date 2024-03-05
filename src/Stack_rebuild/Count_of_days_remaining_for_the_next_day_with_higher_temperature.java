package Stack_rebuild;
import java.util.*;
public class Count_of_days_remaining_for_the_next_day_with_higher_temperature {
    class GFG{

        // Function to determine how many days
        // required to wait for the next
        // warmer temperature
        static int[] dailyTemperatures(int[] temperatures)
        {
            int size = temperatures.length;
            Stack<Integer> stack = new Stack<>();
            int[] resultarr = new int[size];
            for (int i = size - 1; i >= 0; i--) {
                while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    resultarr[i] = -1;
                } else {
                    resultarr[i] = stack.peek() - i;
                }
                stack.push(i);
            }
            return resultarr;
        }

        // Driver Code
        public static void main(String[] args)
        {

            // Given temperatures
            int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};

            // Function call
            int[] ans = dailyTemperatures(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(ans[i] + " ");
            }
        }
    }
}
