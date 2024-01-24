package LinkedList_Nikhil;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    /*--------------------INSERTION--------------------------*/


    public ListNode insertAtBeginning(ListNode head,int valToInsert){
        ListNode newNode=new ListNode(valToInsert);
        newNode.next=head;
        head=newNode;
        return head;
    }

    public ListNode insertAtEnd(ListNode head,int valToInsert){
        ListNode newNode=new ListNode(valToInsert);
        ListNode ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
        return head;
    }

    public ListNode insertAtTheMiddle(ListNode head,int valToInsert,int position){
        ListNode newNode=new ListNode(valToInsert);
        ListNode ptr=head;
        for (int i = 0; i < position; i++) {
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;
        return head;
    }


    /*--------------------DELETION--------------------------*/

    public ListNode deleteAtBeginning(ListNode head){
        head=head.next;
        return head;
    }

    public ListNode deleteAtLast(ListNode head){
        ListNode ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;
        return head;
    }

    public ListNode deleteAtMiddle(ListNode head, int position) {
        ListNode ptr = head;

        // If position is 1, call deleteAtBeginning and return its result
        if (position == 1) {
            return deleteAtBeginning(head);
        }

        // Move to the node before the one to be deleted
        for (int i = 0; i < position - 2; i++) {
            ptr = ptr.next;
        }

        // Get the node to delete
        ListNode nodeToDelete = ptr.next;
        ListNode nextNode = nodeToDelete.next;

        // Point the next of ptr to nextNode
        ptr.next = nextNode;

        return head;
    }










    //Traversing a LinkedList

    public void traverseALinkedList(ListNode head) {

        ListNode temp = head;

        // Run a loop until you reach null
        while (temp != null) {

            // Print the first value
            System.out.println(temp.val);

            // Move to the next node
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        // Create 3 nodes
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(8);
        ListNode l3 = new ListNode(15);




        // Link the nodes
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        System.out.println("Original Linked List:");
        l1.traverseALinkedList(l1);

        // Insert at the beginning
        int valueToInsertAtBeginning = 2;
        l1 = l1.insertAtBeginning(l1, valueToInsertAtBeginning);
        int valueToInsertAtBeginning1 = 5;
        l1 = l1.insertAtBeginning(l1, valueToInsertAtBeginning1);
        int valueToInsertAtBeginning2 = 6;
        l1 = l1.insertAtBeginning(l1, valueToInsertAtBeginning2);
        int valueToInsertAtBeginning3 = 8;
        l1 = l1.insertAtBeginning(l1, valueToInsertAtBeginning3);


        // Print the linked list after insertion at the beginning
        System.out.println("Linked List after Inserting at the Beginning:");
        l1.traverseALinkedList(l1);

        // Insert at the end
        int valueToInsertAtEnd = 20;
        l1 = l1.insertAtEnd(l1, valueToInsertAtEnd);

        // Print the linked list after insertion at the end
        System.out.println("Linked List after Inserting at the End:");
        l1.traverseALinkedList(l1);

        l1 = l1.deleteAtBeginning(l1);
        System.out.println("Linked List after Deletion at the first");
        l1.traverseALinkedList(l1);

        l1 = l1.deleteAtLast(l1);
        System.out.println("Linked List after Deletion at the last");
        l1.traverseALinkedList(l1);

       l1=l1.deleteAtMiddle(l1,3);
        System.out.println("after deletion");
        l1.traverseALinkedList(l1);



    }


}
