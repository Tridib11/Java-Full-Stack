package Greedy_restart_tuf;

import java.util.Arrays;

public class Minimum_number_of_platforms {

    static int platform(int[] arr,int[] dep,int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform_needed=1,result=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platform_needed++;
                i++;
            }
            else if (arr[i]>dep[j]){

            }
        }
    }
    public static void main(String[] args) {

    }
}
