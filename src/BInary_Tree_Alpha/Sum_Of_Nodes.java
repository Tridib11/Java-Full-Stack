package BInary_Tree_Alpha;

public class Sum_Of_Nodes {
    class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int sumBT(Node root){
        //Code
        if(root==null)
        {
            return 0;
        }
        int lh=sumBT(root.left);
        int rh=sumBT(root.right);
        return lh+rh+root.data;
    }
}
