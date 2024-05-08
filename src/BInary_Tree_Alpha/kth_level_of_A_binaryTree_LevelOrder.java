package BInary_Tree_Alpha;

import java.util.ArrayList;
import java.util.List;

import static BInary_Tree_Alpha.kth_level_of_A_binaryTree_Preorder.kthLevelNodes;

public class kth_level_of_A_binaryTree_LevelOrder {
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

        int k = 3; // Specify the level you want to find
        List<Integer> result = kthLevelNodes(root, k);
        System.out.println("Nodes at level " + k + ": " + result);
    }

    public List<Integer> kthLevelNodes(Node root,int k){
        List<Integer> result=new ArrayList<>();
        kthLevelNodeHelper(root,k,1,result);
        return result;
    }


}
