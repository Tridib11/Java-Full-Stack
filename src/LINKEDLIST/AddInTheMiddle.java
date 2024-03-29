package LINKEDLIST;

public class AddInTheMiddle {
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

    // Add First = O(1) constant time

    public void addFirst(int data){
        //step 1 - create new Node
        Node newNode=new Node(data);
        //if the linkedlist is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2 - newNode next=head
        newNode.next=head;
        //step3 - head=newNode
        head=newNode;
    }

    //Add last - O(1) constant time

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ListNode is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // adding in the middle

    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        AddInTheMiddle ll=new AddInTheMiddle();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

        ll.addMiddle(2,10);
        ll.print();
    }
}
