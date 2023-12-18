package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,1,0,2,19,3,34,15};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
    The function recursively calls itself on both leftHalf and rightHalf.
    This process continues until the base case is reached for each smaller subarray.
    */
    static void mergeSort(int[] arr)

    {
        int arrLength=arr.length;
        if(arrLength<2){
            return;
        }
        int midIndex=arrLength/2;
        int[] leftHalf=new int[midIndex];
        int[] rightHalf=new int[arrLength-midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i]=arr[i];
        }
        for (int i = midIndex; i <arrLength ; i++) {
            rightHalf[i-midIndex]=arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr,leftHalf,rightHalf);
    }

    /*
    The merge function is responsible for merging two sorted arrays into a single sorted array.
    */
    static void merge(int[] arr,int[] leftHalf,int rightHalf[]){
        int leftSize= leftHalf.length;
        int rightSize= rightHalf.length;
        int i=0,j=0,k=0;
        while(i<leftSize && j<rightSize){
            if(leftHalf[i]<=rightHalf[j]){
                arr[k]=leftHalf[i];
                i++;
            }
            else {
                arr[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        //for the remaining elements in both the array
        while(i<leftSize){
            arr[k]=leftHalf[i];
            i++;
            k++;
        }
        while(i<rightSize){
            arr[k]=rightHalf[j];
            j++;
            k++;
        }
    }
}
