package Queue;
import java.util.*;
public class testing {

    class Solution
    {
        //Function to find the first non-repeating character in a string.
        static char nonrepeatingCharacter(String str)
        {
            //Your code here
            Queue<Character> q=new LinkedList<>();
            int[] freq=new int[26];

            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                q.add(ch);
                freq[ch-'a']++;
                while(!q.isEmpty() && freq[q.peek()-'a']>1){
                    q.remove();
                }
                if(q.isEmpty()){
                    return '$';
                }
                else{
                    return q.peek();
                }
            }
            return '$';
        }
    }

}
