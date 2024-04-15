package Greedy_Alpha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection_Unsorted {
    public static void main(String[] args) {
        int[] start={2,1};
        int[] end={2,2};
        int[][] activities=new int[start.length][3];
        for(int i=0;i< start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct=1;
        ArrayList<Integer> ans=new ArrayList<>();

        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];

        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }

        System.out.println("Max Activities "+maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();


    }
}
