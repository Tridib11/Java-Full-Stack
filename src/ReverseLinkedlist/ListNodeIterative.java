package ReverseLinkedlist;
//https://leetcode.com/problems/reverse-linked-list/description/
//time o(n) space o(1)
public class ListNodeIterative {
    int val;
    ListNodeIterative next;

    ListNodeIterative() {
    }

    ListNodeIterative(int val) {
        this.val = val;
    }

    ListNodeIterative(int val, ListNodeIterative next) {
        this.val = val;
        this.next = next;
    }

    class Solution {
        public ListNodeIterative reverseList(ListNodeIterative head) {
            ListNodeIterative prev = null, curr = head;
            while (curr != null) {
                ListNodeIterative next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }
}
