package Recursion;

import java.util.ArrayList;

public class SubSequence_Arraylsit {
    public static void main(String[] args) {
        System.out.println(SubSeqRet("","abc"));
    }

    static ArrayList<String> SubSeqRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> left=SubSeqRet(p+ch,up.substring(1));
        ArrayList<String> right=SubSeqRet(p,up.substring(1));
        left.addAll(right);
//
///Removing the empty spaces

        ArrayList<String> result=new ArrayList<>();
        for (String str:left){
            if(!str.isEmpty()){
                result.add(str);
            }
        }
        return result;
    }
}
