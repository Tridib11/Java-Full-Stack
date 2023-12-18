package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.print(Digits(1342));
    }
    static int Digits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+Digits(n/10);
    }
}
