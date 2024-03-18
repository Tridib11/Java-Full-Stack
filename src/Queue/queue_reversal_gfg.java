package Queue;
import java.util.*;
//https://www.geeksforgeeks.org/problems/queue-reversal/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class queue_reversal_gfg {
    static class GfG{
        //Function to reverse the queue.
        public Queue<Integer> rev(Queue<Integer> q){
            //add code here.
            Stack<Integer> stack=new Stack<>();
            while(!q.isEmpty()){
                stack.push(q.remove());
            }
            while(!stack.isEmpty()){
                q.add(stack.pop());
            }
            return q;
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }
        GfG obj=new GfG();
        obj.rev(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();

    }

}
