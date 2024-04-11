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
                platform_needed--;
                j++;
            }
            if(platform_needed>result){
                result=platform_needed;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr ={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        int n=arr.length;
        int totalPlatformCount=platform(arr,dep,n);
        System.out.println(totalPlatformCount);
    }
}
