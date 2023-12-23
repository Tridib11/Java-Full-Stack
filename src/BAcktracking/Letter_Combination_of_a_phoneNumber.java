package BAcktracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

public class Letter_Combination_of_a_phoneNumber {
    public static void main(String[] args) {
//        System.out.println(pad("","23"));
        System.out.println(letterCombinations("23"));
    }

//    static void pad(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        int digit=up.charAt(0)-'0';
//        for (int i = (digit-1)*3; i < digit*3 ; i++) {
//            char ch=(char)('a'+i);
//            pad(p+ch,up.substring(1));
//        }
//    }
//static ArrayList<String> pad(String p, String up){
//    if(up.isEmpty()){
//        ArrayList<String> list=new ArrayList<>();
//        list.add(p);
//        return list;
//    }
//    int digit=up.charAt(0)-'0';
//    ArrayList<String> list=new ArrayList<>();
//    for (int i = (digit-1)*3; i < digit*3 ; i++) {
//        char ch=(char)('a'+i);
//        list.addAll(pad(p+ch,up.substring(1)));
//    }
//    return list;
//}

public static List<String> letterCombinations(String digits){
        List<String> ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        HashMap<Character,String> hm=new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        backTrack(digits,0,hm,new StringBuilder(),ans);
        return ans;
}
    static void backTrack(String digits,int i,HashMap<Character,String> hm,StringBuilder sb,List<String> ans){
        if(i==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String curr=hm.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++){
            sb.append(curr.charAt(k));
            backTrack(digits,i+1,hm,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
