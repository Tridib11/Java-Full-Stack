package Greedy_Alpha;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

/*
v={60,100,120}
w={10,20,30}

v/w=6,5,4

idx v/w
0   4
1   5
2   6
*/

class GFG_Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        // Your code here

        double[][] newArray=new double[n][2];
        for(int i=0;i<n;i++){
            newArray[i][0]=i;
            newArray[i][1]=arr[i].value/(double)arr[i].weight;
        }
        Arrays.sort(newArray,Comparator.comparingDouble(o -> o[1])); //ascending order
        int finalCapacity=W;
        double finalValue=0.0;
        for(int i=arr.length-1;i>=0;i--){
            int idx=(int)newArray[i][0];
            if(finalCapacity >= arr[idx].weight){
                finalCapacity-=arr[idx].weight;
                finalValue+=arr[idx].value;
            }
            else{
                finalValue+=(newArray[i][1]*finalCapacity);
                finalCapacity=0;
                break;
            }
        }
        return finalValue;

    }
}

public class Fractional_KNapsack_GFG {

}
