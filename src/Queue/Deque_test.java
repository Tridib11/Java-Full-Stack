package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_test {
    public static void main(String[] args) {
        Deque<Integer> q=new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        System.out.println(q);
        q.addLast(12);
        q.removeFirst();
        System.out.println(q);
    }

}
