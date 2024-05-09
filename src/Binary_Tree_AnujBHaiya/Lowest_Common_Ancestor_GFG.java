package Binary_Tree_AnujBHaiya;


public class Lowest_Common_Ancestor_GFG {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);


    }


    class Solution{
        //Function to return the lowest common ancestor in a Binary Tree.
        Node lca(Node root, int n1,int n2)
        {
            if(root==null) return null;
            if(root.data==n1 || root.data==n2) return root;

            Node left=lca(root.left,n1,n2);
            Node right=lca(root.right,n1,n2);

            if(left==null) return right;
            if(right==null) return left;

            return root;
        }
    }


}
