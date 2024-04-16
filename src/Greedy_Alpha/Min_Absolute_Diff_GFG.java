package Greedy_Alpha;
import java.util.*;
public class Min_Absolute_Diff_GFG {

    class Solution {
        long findMinSum(int[] A,int[] B,int N) {
            Arrays.sort(A);
            Arrays.sort(B);
            long minDiff=0;
            for(int i=0;i<N;i++){
                minDiff+=Math.abs(A[i]-B[i]);
            }
            return minDiff;
        }
    }
}
