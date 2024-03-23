package Greedy_Alogorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
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
        ArrayList<meetings> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new meetings(start[i],end[i],i+1 ));
            }
            meetingComparator com=new meetingComparator();
            Collections.sort(list,com);
            ArrayList<Integer> ans=new ArrayList<>();
            ans.add(list.get(0).pos);
            int limit=list.get(0).end;
            for (int j = 1; j <n ; j++) {
                if(limit<list.get(j).start){
                    ans.add(list.get(j).pos);
                    limit=list.get(j).end;
                }
            }
            return ans.size();
    }
}
