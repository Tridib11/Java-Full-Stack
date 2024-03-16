package Queue;
//https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
import java.util.*;
public class First_Nonrepeating_Character {
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
