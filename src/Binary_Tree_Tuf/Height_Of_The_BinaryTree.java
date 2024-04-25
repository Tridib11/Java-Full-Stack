package Binary_Tree_Tuf;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class Height_Of_The_BinaryTree {
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


    public int maxDepth(Node root){
        if(root==null){
            return 0;
        }
        int lh= maxDepth(root.left);
        int rh= maxDepth(root.right);
        return 1+ Math.max(lh,rh);
    }
}
