package Queue;
import java.util.*;
public class Interleave_the_First_Half_of_the_Queue_with_Second_Half_gfg {
    //https://www.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/0
    class Solution {
        public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
            // code here
            Queue<Integer> firstHalf = new LinkedList<>();
            ArrayList<Integer> interleavedList = new ArrayList<>();

            int size = q.size();

            for (int i = 0; i < size / 2; i++) {
                firstHalf.add(q.remove());
            }

            while (!firstHalf.isEmpty()) {
                interleavedList.add(firstHalf.remove());
                interleavedList.add(q.remove());
            }

            // Add any remaining elements from the original queue
            while (!q.isEmpty()) {
                interleavedList.add(q.remove());
            }

            return interleavedList;
        }
    }
}
