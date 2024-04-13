package Greedy_restart_tuf;

import java.util.ArrayList;
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

class activityComparator implements Comparator<Activity>{

    @Override
    public int compare(Activity o1, Activity o2) {
        if(o1.end<o2.end){
            return -1;
        } else if (o1.end>o2.end) {
            return 1;
        }
        else if(o1.pos <)
    }
}
public class Activity_Selection {

    public int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<Activity> meet=new ArrayList<>();
        for(int i=0;i<n;i++){
            meet.add(new Activity(start[i],end[i],i+1));
        }
    }
}
