package Greedy_Alpha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Indian_coins {
    public static void main(String[] args) {
        Integer[] coins={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoins=0;
        int amount=590;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i =0;i<coins.length;i++){

                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }

        }
        System.out.println(ans.size());
    }
}
