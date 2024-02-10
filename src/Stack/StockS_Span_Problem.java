package Stack;

import java.util.Stack;

class New_Solution_GFG
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int arr[], int n)
    {
        Stack<Integer> st = new Stack<>();
        int ans []= new int[n];
        for(int i = 0; i < n; i++)
        {
            while(!st.isEmpty() && arr[i] >= arr[st.peek()])
                st.pop();
            if(st.isEmpty())
                ans[i] = i+1;
            else
                ans[i] = i - st.peek() ;
            st.push(i);
        }
        return ans;
    }
}

public class StockS_Span_Problem {

    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice=stocks[i];
            while(!s.isEmpty() && currPrice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+",");
        }

    }
}
