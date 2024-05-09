package BInary_Tree_Alpha;

import Binary_Tree_AnujBHaiya.Lowest_Common_Ancestor_GFG;

public class Min_DIstance_Between_Two_Nodes {
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


    }

    public static Node lowest_Common_Ancestor(Node root,int n1,int n2){
        if(root==null) return null;
        if(root.data==n1 || root.data==n2) return root;

        Node left=lowest_Common_Ancestor(root.left,n1,n2);
        Node right=lowest_Common_Ancestor(root.right,n1,n2);

        if(left==null) return right;
        if(right==null) return left;

        return root;
    }

    public static int lcaDist(Node root,int n){
         if(root==null) return -1;
         if(root.data==n) return 0;
         int leftDist=lcaDist(root.left,n);
         int rightDist=lcaDist(root.right,n);
         if(leftDist == -1 && rightDist==-1){
             return -1;
         }
         else if(leftDist==-1){
             return rightDist+1;
         }
         else{
             return leftDist+1;
         }
    }


    public static int minDist(Node root,int n1,int n2){
        Node lca=lowest_Common_Ancestor(root,n1,n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);

        return dist1+dist2;
    }



}
