package Greedy_Alpha;
import java.util.*;

//https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1
class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        int[][] activities=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        int maxAct=1;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        return ans.size();
    }
}
public class Activity_Selection_GFG {

}
