package LINKEDLIST;

public class SizeOfaLinkedlist {
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
    public static int size;

    // Add First = O(1) constant time

    public void addFirst(int data){
        //step 1 - create new Node
        Node newNode=new Node(data);
        size++;
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
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // adding in the middle

    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        SizeOfaLinkedlist ll=new SizeOfaLinkedlist();
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

        System.out.println("Size of the LinkedList is : "+size);
    }
}
