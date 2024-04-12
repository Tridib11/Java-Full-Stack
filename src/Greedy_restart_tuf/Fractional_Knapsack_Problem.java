package Greedy_restart_tuf;
//https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
import java.util.Arrays;
import java.util.Comparator;
class Item{
    int value,weight;
    Item(int value,int weight){
        this.value=value;
        this.weight=weight;
    }
}

class itemComparator implements Comparator<Item>{
    @Override
    public int compare(Item a, Item b) {
        double r1=(double)(a.value)/(double)(a.weight);
        double r2=(double)(b.value)/(double)(b.weight);
        if(r1<r2) return 1;
        else if(r1>r2) return -1;
        else return 0;
    }

}
public class Fractional_Knapsack_Problem {
    static double fractionalKnapsack(int W,Item[] arr,int n){
        Arrays.sort(arr,new itemComparator());
        int currWeight=0;
        double finalWeight=0.0;
        for(int i=0;i<n;i++){
            if(currWeight+arr[i].weight<W){
                currWeight+=arr[i].weight;
                finalWeight+=arr[i].value;
            }
            else{
                int remainingWeight=W-currWeight;
                finalWeight+=((double) arr[i].value/(double) arr[i].weight)*(double) remainingWeight;
                break;
            }
        }
        return finalWeight;
    }

    public static void main(String[] args) {
        int n = 3, weight = 50;
        Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
        double ans = fractionalKnapsack(weight, arr, n);
        System.out.println("The maximum value is "+ans);
    }
}
