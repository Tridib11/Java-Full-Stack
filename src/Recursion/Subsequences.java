package Recursion;

public class Subsequences {
    public static void main(String[] args) {
        Subsequences("","abc");
    }
    static void Subsequences(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        Subsequences(p+ch,up.substring(1));
        Subsequences(p,up.substring(1));
    }
}
