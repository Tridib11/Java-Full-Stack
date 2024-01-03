package Linked_List;

public class CreatingHeadAndTail {
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
        CreatingHeadAndTail ll=new CreatingHeadAndTail();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
    }
}
