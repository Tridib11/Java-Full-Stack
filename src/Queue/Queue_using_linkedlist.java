package Queue;

public class Queue_using_linkedlist {

    static class Node{
        int data;
        Node next;
        Node(int data){
          this.data=data;
          this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;



        public static boolean isEmpty(){
            return head==null && tail==null;
        }


        //add
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue.Circular_Queue_using_Array.Queue q=new Queue.Circular_Queue_using_Array.Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
