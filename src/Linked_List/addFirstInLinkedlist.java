package Linked_List;

public class addFirstInLinkedlist {
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
        //step 2 - newNode next=head
        newNode.next=head;
        //step 3 - head=newNode
        head=newNode;
    }

    public static void main(String[] args) {
        addFirstInLinkedlist ll=new addFirstInLinkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
    }



}
