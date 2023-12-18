package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,1,3,5,4};
        BubbleSort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr,int endIndex)
    {
        if(endIndex==0){
            return;
        }
        for (int i = 0; i < endIndex; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        BubbleSort(arr,endIndex-1);

    }
}
