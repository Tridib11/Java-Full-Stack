package Recursion;

import java.util.Arrays;
import java.util.Random;

public class OptimizedQuickSort {
    public static void main(String[] args) {
        int[] arr={5,1,0,2,19,3,34,15};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    static void quickSort(int[] arr, int lowIndex, int highIndex){
        if(lowIndex>=highIndex){
            return;
        }
        int pivotIndex=new Random().nextInt(highIndex-lowIndex)+lowIndex;
        int pivot=arr[pivotIndex];
        swap(arr,pivotIndex,highIndex);
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
        quickSort(arr,lowIndex,leftPointer-1);
        quickSort(arr,leftPointer+1,highIndex);
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
