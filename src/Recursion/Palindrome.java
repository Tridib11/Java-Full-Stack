package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(length(1234));
    }
    static boolean length(int n){
        int digits=(int)(Math.log10(n))+1;
        if (palindrome(n,digits)==n) return true;
        return false;
    }
    static int palindrome(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+palindrome(n/10,digits-1);
    }
}
