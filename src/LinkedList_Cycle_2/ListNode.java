package LinkedList_Cycle_2;
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (slowPtr != null && fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                slowPtr = head;
                while (slowPtr != fastPtr) {
                    slowPtr = slowPtr.next;
                    fastPtr = fastPtr.next;
                }
                return slowPtr;
            }
        }
        return null;
    }
}

