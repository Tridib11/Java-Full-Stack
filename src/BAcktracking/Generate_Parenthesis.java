package BAcktracking;
import java.util.*;
//https://leetcode.com/problems/generate-parentheses/
public class Generate_Parenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        findAll("(",1,0,result,n);
        return result;
    }

    static void findAll(String current,int o,int c,List<String> result,int n){
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(o<n) findAll(current+"(",o+1,c,result,n);
        if(c<o) findAll(current+")",o,c+1,result,n);
    }
}
