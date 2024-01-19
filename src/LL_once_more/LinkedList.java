package LL_once_more;

public class LinkedList {
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
    public static int size=0;

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

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addMiddle(int position,int data){
        if(position==0){
            addFirst(data);
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int index=0;
        while(index<position-1){
            temp=temp.next;
            index++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public int removeFist(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return 0;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return 0;
        }
        if(size==1){
            int val=head.data;
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
        size--;
        return val;
    }

    public int search(int data){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.data == data){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }

    public int recursiveSearch(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=recursiveSearch(head.next,key);
        if(idx==-1){
            return 0;
        }
        return idx+1;

    }
    public void recursiveSearchHelper(int data){
      recursiveSearch(head,data);

    }

    public void reverse(){
        Node prev=null;
        Node current =tail=head;
        Node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    public void deleteNthfromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    /*
    LeetCode solution

    Link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            return head.next;
        }

        int i = 1;
        int iToFind = sz - n;
        ListNode prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
}
    */



    //Palindrome
    public boolean checkPalindrome(){
        if(head==null || head.next!=null){
            return true;
        }
        //Step1-find mid

        Node midNode=findMid(head);

        //step2-Reverse 2nd HAlf
        Node prev=null;
        Node current =midNode;
        Node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        Node right=prev; //right half head
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }



    //Slow-fast approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null || fast.next!=null){
            slow=slow.next;//+1;
            fast=fast.next.next;//+2
        }
        return slow;
    }



    public void printLL(){
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
        LinkedList ll=new LinkedList();
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addFirst(8);
        ll.printLL();
        ll.addFirst(9);
        ll.printLL();
        ll.addFirst(6);
        ll.printLL();
        ll.addFirst(7);
        ll.printLL();
        ll.addFirst(5);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
        ll.addMiddle(2,0);
        ll.printLL();
        System.out.println("Size "+size);
        System.out.println("Element removed : "+ll.removeLast());
        ll.printLL();
        System.out.println("Element removed : "+ll.removeLast());
        ll.printLL();
        int val= ll.search(6);
        if(val <0){
            System.out.println("ELement not found");
        }
        System.out.println("ELemement found at index "+val);

//        ll.reverse();
//        ll.printLL();

        ll.deleteNthfromEnd(3);
        ll.printLL();


    }
}
