package Stack_rebuild;

import java.util.Stack;

public class PushAtTheBottomOfTheStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        System.out.println(s);
    }
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }


}
