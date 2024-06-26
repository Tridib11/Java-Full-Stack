package Greedy_Alpha;

import java.util.Arrays;
import java.util.Comparator;
//https://leetcode.com/problems/maximum-length-of-pair-chain/description/
public class Max_length_of_Pair_Chain_Leetcode {
    static int[][] demo={{5,24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int chainLength=1;
        int lastChainEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastChainEnd){
                chainLength++;
                lastChainEnd=pairs[i][1];
            }
        }
        return chainLength;
    }
}
