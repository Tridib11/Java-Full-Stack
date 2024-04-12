package Greedy_restart_tuf;

import java.util.ArrayList;
import java.util.Arrays;

public class Number_of_Coins {

    public static void minCoins(int coins[], int M, int V) {
        Arrays.sort(coins);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = M - 1; i >= 0; i--) {
            while (V >= coins[i]) {
                V -= coins[i];
                ans.add(coins[i]);
            }
        }
        System.out.println("The minimum number of coins is " + ans.size());
        System.out.println("The coins are ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(" " + ans.get(i));
        }
    }

    public static void main(String[] args) {
        int[] coins = {25,10,5};
        int M = coins.length;
        int V = 30;
        minCoins(coins, M, V);
    }
}
