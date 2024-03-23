package Greedy_Alogorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class meetings{
        int start,end,pos;
        meetings(int start,int end,int pos){
            this.start=start;
            this.end=end;
            this.pos=pos;
        }

}

class meetingComparator implements Comparator<meetings>{

    @Override
    public int compare(meetings o1, meetings o2) {
        if(o1.end<o2.end){
            return -1;
        }
        else if(o1.end>o2.end){
            return 1;
        }
        else if(o1.pos<o2.pos){
            return -1;
        }
        return 1;
    }
}
public class Nmeetings_in_one_room
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<meeting> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new meeting(start[i],end[i],i+1 ));
            meetingComparator com=new meetingComparator();
            Collections.sort(list,com);
        }
    }
}
