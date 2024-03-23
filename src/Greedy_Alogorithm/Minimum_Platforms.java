package Greedy_Alogorithm;
//https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
import java.util.Arrays;

public class Minimum_Platforms {
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat_needed=1,result=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat_needed++;
                i++;
            } else if (arr[i]>dep[j]) {
                plat_needed--;
                j++;
            }
            if(plat_needed>result){
                result=plat_needed;
            }
        }
        return result;

    }
}
