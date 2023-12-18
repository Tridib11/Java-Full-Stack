package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(1002000));
    }
    static int count (int n){
        return CountZeroes(n,0);
    }
    static int CountZeroes(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return CountZeroes(n/10,c+1);
        }
        return CountZeroes(n/10,c);
    }
}
