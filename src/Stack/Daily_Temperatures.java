package Stack;


import java.util.Stack;

class Solution{
    public int[] dailyTemperatures(int[] temperatures){
        int[] ans=new int[temperatures.length];
        Stack<Integer>s=new Stack<>();
        for (int i = temperatures.length-1;i >=0 ; i--) {
            if(s.isEmpty()){
                s.push(i);
                ans[i]=0;
            }else{
                while(!s.isEmpty() && temperatures[i]>=temperatures[s.peek()]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=0;
                }else{
                    ans[i]=s.peek()-i;
                }
                s.push(i);
            }

        }
        return ans;
    }
}
public class Daily_Temperatures {
    public static void main(String[] args) {

    }
}
