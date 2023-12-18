package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,1,0,2,19,3,34,15};
        quikSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quikSort(int[] arr,int lowIndex,int highIndex){
        if(lowIndex>highIndex){
            return;
        }
        int pivot=arr[highIndex];
        int leftPointer=lowIndex;
        int righPointer=highIndex;
        while(leftPointer<righPointer){
            while(arr[leftPointer]<=pivot && leftPointer<righPointer){
                leftPointer++;
            }
            while(arr[righPointer]>=pivot && leftPointer<righPointer){
                righPointer--;
            }
            swap(arr,leftPointer,righPointer);
        }
        swap(arr,leftPointer,highIndex);
        quikSort(arr,lowIndex,leftPointer-1);
        quikSort(arr,leftPointer+1,highIndex);
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
