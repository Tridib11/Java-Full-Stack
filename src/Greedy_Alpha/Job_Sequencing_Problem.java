package Greedy_Alpha;

//https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1

import java.util.*;
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}
class Solution_JOb
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)-> (b.profit-a.profit));
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline>max){
                max=arr[i].deadline;
            }
        }

        int[] result=new int[max+1];
        for(int i=1;i<result.length;i++){
            result[i]=-1;
        }

        int countJob=0,jobProfit=0;

        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(result[j]==-1){
                    result[j]=arr[i].id;
                    countJob++;
                    jobProfit+=arr[i].profit;
                    break;
                }
            }
        }

        int[] ans=new int[2];
        ans[0]=countJob;
        ans[1]=jobProfit;
        return ans;

    }
}
public class Job_Sequencing_Problem {

    public static void main(String[] args) {

    }
}
