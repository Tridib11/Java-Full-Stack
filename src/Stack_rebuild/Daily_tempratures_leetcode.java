package Stack_rebuild;
import java.util.*;
//https://leetcode.com/problems/daily-temperatures/
public class Daily_tempratures_leetcode {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int size= temperatures.length;
            Stack<Integer> stack= new Stack<>();
            int[] resultarr=new int[size];
            for(int i=size-1;i>=0;i--){
                while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    resultarr[i]=0;
                }else{
                    resultarr[i]=stack.peek()-i;
                }
                stack.push(i);
            }
            return resultarr;
        }
    }
}
