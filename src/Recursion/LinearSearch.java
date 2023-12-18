package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Search(arr,0,12));
    }

    static boolean Search(int[] arr,int index,int target){
        if(index==arr.length-1 && arr[index]!=target) {
            return false;
        }
        return arr[index]==target || Search(arr,index+1,target);
    }
}
