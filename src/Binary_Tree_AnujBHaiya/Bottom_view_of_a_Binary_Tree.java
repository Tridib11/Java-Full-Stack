package Binary_Tree_AnujBHaiya;
import java.util.*;
public class Bottom_view_of_a_Binary_Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }


    class Pair{
        int horizontal_distance;
        Node node;
        Pair(int horizontal_distance,Node node){
            this.horizontal_distance=horizontal_distance;
            this.node=node;
        }
    }

    class Solution{
        public ArrayList <Integer> bottomView(Node root)
        {
            Queue<Pair> queue=new ArrayDeque<>();
            Map<Integer,Integer> map=new TreeMap<>();

        }
    }


}
