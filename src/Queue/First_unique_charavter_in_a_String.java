package Queue;
import java.util.*;
public class First_unique_charavter_in_a_String {
    class Solution {
        public int firstUniqChar(String str) {
            Queue<Character> queue = new LinkedList<>();
            int[] freq = new int[26];

            // Iterate through the string.
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                queue.add(ch);
                freq[ch - 'a']++;

                // Remove characters from the queue until finding a non-repeating character.
                while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                    queue.remove();
                }
            }

            // Iterate through the string again to find the index of the first non-repeating character.
            for (int i = 0; i < str.length(); i++) {
                if (freq[str.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }

            // If no non-repeating character is found, return -1.
            return -1;

        }
    }
}
