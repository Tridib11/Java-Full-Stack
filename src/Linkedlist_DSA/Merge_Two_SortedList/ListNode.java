package Linkedlist_DSA.Merge_Two_SortedList;
//https://leetcode.com/problems/merge-two-sorted-lists/submissions/1155134795/
public class ListNode {
    int val;
    ListNode next;
    ListNode(){

    }
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }


}

class Solution {
    public LinkedList_Nikhil.ListNode mergeTwoLists(LinkedList_Nikhil.ListNode list1, LinkedList_Nikhil.ListNode list2) {
        LinkedList_Nikhil.ListNode dummy=new LinkedList_Nikhil.ListNode(0);
        LinkedList_Nikhil.ListNode curr=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        curr.next=list1!=null?list1:list2;
        return dummy.next;
    }
}
