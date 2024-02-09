package Stack;

import java.util.Stack;
//https://www.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
public class ReverseAString {
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder newString=new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            newString.append(curr);
        }
        return newString.toString();
    }
    public static void main(String[] args) {


    }
}
