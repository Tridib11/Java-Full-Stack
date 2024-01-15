package Recursion;

public class number_Backwards {
    public static void main(String[] args) {
        reverse(5);
    }
//    static int reverse(int num){
//        if(num==1){
//            System.out.Cat(1);
//            return num;
//        }
//        System.out.Cat(num+" ");
//        return reverse(num-1);
//    }
    //or
    static void reverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        reverse(n-1);
    }
}
