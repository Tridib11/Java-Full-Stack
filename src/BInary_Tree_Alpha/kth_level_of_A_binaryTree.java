package BInary_Tree_Alpha;
import java.util.*;
public class kth_level_of_A_binaryTree {

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
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int k = 2; // Specify the level you want to find
        List<Integer> result = kthLevelNodes(root, k);
        System.out.println("Nodes at level " + k + ": " + result);
    }

    private static List<Integer> kthLevelNodes(Node root, int k) {
    }


}
