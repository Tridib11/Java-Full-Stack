package LinkedLIsr_wpaisSe;

import java.util.LinkedList;

public class LInkedList {
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

    //Add First
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Add Last
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //Add at any Index

    public void add(int idx,int data){
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

    //Remove First

    public int removeFirst(){
        if(size==0){
            System.out.println("ListNode is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }

    // Remove Last

    public int removeLast(){
        if(size==0){
            System.out.println("ListNode is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;

    }

    //Search in a iterative way

    public int find(int key){
        Node temp=head;
//        for(int i=0;i<size;i++){
//            if(temp.data==key){
//                return i;
//            }
//            else{
//                temp=temp.next;
//            }
//        }

        //or
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }else{
                i++;
                temp=temp.next;
            }
        }
        return -1;
    }



    // Search in a linkedList in a recursive way

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }



    //Printing a linkedList

    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
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
        LInkedList ll=new LInkedList();
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addFirst(8);
        ll.addFirst(9);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(5);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
        ll.add(0,99);
        ll.printLL();
        System.out.println("Size of the ListNode is "+size);
        System.out.println(ll.removeFirst()+" removed");
        ll.printLL();
        System.out.println(ll.removeFirst()+" removed");
        ll.printLL();
        System.out.println(ll.removeFirst()+" removed");
        ll.printLL();
        System.out.println("Size of the ListNode is "+size);
        System.out.println(ll.removeLast()+" removed");
        ll.printLL();
        ll.addLast(24);
        ll.addLast(32);
        System.out.println("Size of the ListNode is "+size);
        ll.printLL();
        System.out.println("Element found at index "+ll.find(32));
        System.out.println("Element found at index "+ll.recSearch(32));

    }
}
