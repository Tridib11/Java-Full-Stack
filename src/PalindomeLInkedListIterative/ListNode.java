package PalindomeLInkedListIterative;
import java.util.ArrayList;
public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        solution solutionObj = new solution();
        boolean result = solutionObj.isPalindrome(list);
        System.out.println(result); // Output: true
    }
}

class solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ArrayList<Integer> List = new ArrayList<>();
        while (head != null) {
            List.add(head.val);
            head = head.next;
        }

        int start = 0;
        int end = List.size() - 1;
        while (start < end) {
            if (List.get(start) != List.get(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}