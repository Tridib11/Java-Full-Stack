package Greedy_restart_tuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        MeetingComparator mc= new MeetingComparator();
        Collections.sort(meet,mc);
        ArrayList<Integer> answer=new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit=meet.get(0).end;
        for(int i=1;i<n;i++){
            if(meet.get(i).start>limit){
                answer.add(meet.get(i).pos);
                limit=meet.get(i).end;
            }
        }
        System.out.println("The order in which the meeting will be performed is ");
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i)+",");
        }
    }

    public static void main(String args[])
    {
        int n = 6;
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        maxMeetings(start,end,n);

    }
}
