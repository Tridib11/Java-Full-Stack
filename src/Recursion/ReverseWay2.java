package Recursion;

public class ReverseWay2 {
    public static void main(String[] args) {
        reverse(1234);
    }
    static void reverse(int n){
        if(n<10){
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }


}
