package Queue;

//https://leetcode.com/problems/implement-queue-using-stacks/
import java.util.*;
public class Queue_using_Stack_amortised {
    class MyQueue {

        Stack<Integer> input;
        Stack<Integer> output;
        public MyQueue() {
            input = new Stack();
            output = new Stack();
        }

        public void push(int x) {
            input.push(x);//ye to har bar karna he
        }

        public int pop() {
            //input -> output o(n)
            if(output.isEmpty()){
                while(!input.isEmpty()){
                    output.push(input.peek());
                    input.pop();
                }
            }
            int val=output.peek(); //o(1)
            output.pop();
            return val;
        }

        public int peek() {
            if(output.isEmpty()){
                while(!input.isEmpty()){
                    output.push(input.peek());
                    input.pop();
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
