package Greedy_restart_tuf;
//https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Activity {
    int start;
    int end;
    int pos;

    Activity(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class ActivityComparator implements Comparator<Activity>{

    @Override
    public int compare(Activity o1, Activity o2) {
        if(o1.end<o2.end){
            return -1;
        } else if (o1.end>o2.end) {
            return 1;
        }
        else if(o1.pos <o2.pos){
            return -1;
        }
        return 1;
    }
}
public class Activity_Selection {

    public int activitySelection(int[] start, int[] end, int n)
    {
        // add your code here
        ArrayList<Activity> meet=new ArrayList<>();
        for(int i=0;i<n;i++){
            meet.add(new Activity(start[i],end[i],i+1));
        }
        ActivityComparator ac=new ActivityComparator();
        meet.sort(ac);
//        Collections.sort(meet,ac);
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(meet.get(0).pos);
        int limit=meet.get(0).end;
        for(int i=1;i<n;i++){
            if(meet.get(i).start>limit){
                limit=meet.get(i).end;
                ans.add(meet.get(i).pos);
            }
        }
        return ans.size();

    }
}
