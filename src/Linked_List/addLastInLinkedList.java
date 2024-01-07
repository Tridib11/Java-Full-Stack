package Linked_List;

public class addLastInLinkedList {
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

    public void addFirst(int data){
        //step 1 - create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        //step 2 - newNode next=LinkedList_head
        newNode.next=head;
        //step 3 - LinkedList_head=newNode
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void main(String[] args) {
        addLastInLinkedList ll=new addLastInLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
}
