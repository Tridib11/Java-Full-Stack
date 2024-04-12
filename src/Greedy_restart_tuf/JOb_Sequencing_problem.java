package Greedy_restart_tuf;

import java.util.Arrays;

class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}

public class JOb_Sequencing_problem {
    static class Result {
        int[] resultArr;
        int maxJobProfit;
        int countJobs;

        Result(int[] resultArr, int maxJobProfit, int countJobs) {
            this.resultArr = resultArr;
            this.maxJobProfit = maxJobProfit;
            this.countJobs = countJobs;
        }
    }

    static Result JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));  //sorting in descending order
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > maxDeadline) {
                maxDeadline = arr[i].deadline;
            }
        }

        int[] resultArr = new int[maxDeadline + 1];
        for (int i = 1; i < resultArr.length; i++) {
            resultArr[i] = -1;
        }

        int countJobs = 0, jobProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                if (resultArr[j] == -1) {
                    resultArr[j] = arr[i].id;
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }

        return new Result(resultArr, jobProfit, countJobs);
    }

    public static void main(String[] args) {
        Job[] arr = new Job[4];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);

        JOb_Sequencing_problem jb = new JOb_Sequencing_problem();
        Result result = jb.JobScheduling(arr, 4);
        int[] ans = result.resultArr;

        System.out.println("Scheduled Jobs:");
        for (int i = 1; i < ans.length; i++) {
            if (ans[i] != -1) {
                System.out.println("Job ID: " + ans[i] + ", Deadline: " + i);
            }
        }

        System.out.println("Max Job Profit: " + result.maxJobProfit);
        System.out.println("Count of Scheduled Jobs: " + result.countJobs);
    }
}
