package Recursion;

public class SumofN {
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
    }
}
