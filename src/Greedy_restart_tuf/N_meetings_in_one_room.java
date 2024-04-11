package Greedy_restart_tuf;

import java.util.ArrayList;
import java.util.Comparator;

class Meeting{
    int start;
    int end;
    int pos;

    Meeting(int start,int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}

class MeetingComparator implements Comparator<Meeting>{
    @Override
    public int compare(Meeting m1,Meeting m2){
        if(m1.end<m2.end){
            return -1;
        }
        else if(m1.end>m2.end){
            return 1;
        } else if (m1.pos < m2.pos) {
            return -1;
        }
        return 1;
    }
}
public class N_meetings_in_one_room {
    static void maxMeetings(int start[],int end[],int n){
        ArrayList<Meeting> meet=new ArrayList<>();
        for(int i=0;i<n;i++){
            meet.add(new Meeting(start[i],end[i],i+1 ));
        }
    }
}
