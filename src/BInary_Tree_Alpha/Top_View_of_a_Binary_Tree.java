package BInary_Tree_Alpha;

import java.util.ArrayList;

public class Top_View_of_a_Binary_Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Pair{
        int horizontal_Distance;
        Node node;
        Pair(int horizontal_Distance,Node node){
            this.node=node;
            this.horizontal_Distance=horizontal_Distance;
        }
    }


    class Solution{
        static ArrayList<Integer> topView(Node root){

        }
    }
}
