package Greedy_Alpha;


import java.util.ArrayList;
import java.util.List;

class Solution_MIN_COINS {
    static List<Integer> minPartition(int amount)
    {
         Integer[] coins={2000,500,200,100,50,20,10,5,2,1};
         int countOfCoins=0;
         List<Integer> ans=new ArrayList<>();
         for(int i=0;i<coins.length;i++){
                 while(coins[i]<=amount){
                     countOfCoins++;
                     ans.add(coins[i]);
                     amount-=coins[i];
                 }
         }
        return ans;
    }
}
public class Minimum_NUmber_ofcoins_GFG {
    public static void main(String[] args) {

    }
}
