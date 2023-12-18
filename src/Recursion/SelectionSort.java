package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,6,8,2};
        SelectionSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr,int startIndex,int endIndex){
        if(startIndex>=endIndex-1){
            return;
        }
        int minIndex=startIndex;
        for (int i = startIndex; i <=endIndex ; i++) {
            if(arr[i]<arr[minIndex])
            {
                minIndex=i;
            }
        }
        int temp=arr[startIndex];
        arr[startIndex]=arr[endIndex];
        arr[endIndex]=temp;
        SelectionSort(arr,startIndex+1,endIndex);
    }
}
