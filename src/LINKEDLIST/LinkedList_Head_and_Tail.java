package LINKEDLIST;

public class LinkedList_Head_and_Tail {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        LinkedList_Head_and_Tail ll=new LinkedList_Head_and_Tail();
        ll.head=new Node(1);
        ll.head.next=new Node(2);

    }
}
