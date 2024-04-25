package BInary_Tree_Alpha;
//https://leetcode.com/problems/count-complete-tree-nodes/
import Binary_Tree_Tuf.Height_Of_The_BinaryTree;

public class Count_Number_Of_Nodes {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public int countNodes(Node root) {
        if(root==null){
            return 0;
        }
        int lh=countNodes(root.left);
        int rh=countNodes(root.right);
        return lh+rh+1;

    }

}
