package Greedy_Alpha;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_KNapsack {
    public static void main(String[] args) {
        int[] val={60,100,120};
        int[] weight={10,20,30};
        int W=50;
        double[][] ratio=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity=W;
        for(int i= ratio.length-1;i>=0;i--){

        }
    }
}
